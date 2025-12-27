package com.example.littlelemon.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserPreferences (
    context: Context
) {

    private val datastore = context.dataStore

    val onboardingCompleted: Flow<Boolean> =
        datastore.data.map { prefs ->
            prefs[PrefKeys.ONBOARDING_DONE] ?: false
        }


    suspend fun setOnboardingCompleted() {

        datastore.edit { prefs ->
            prefs[PrefKeys.ONBOARDING_DONE] = true

        }
    }

}