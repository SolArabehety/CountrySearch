package com.solarabehety.countrysearch.ui.viewmodel

import android.content.res.Resources
import com.solarabehety.core.model.SearchImageError
import com.solarabehety.countrysearch.R
import javax.inject.Inject

internal class StringMapper @Inject constructor(
    private val resources: Resources,
) {

    fun mapErrorString(error: SearchImageError) = when (error) {
        SearchImageError.NoInternetConnection -> resources.getString(R.string.no_internet_connection)
        SearchImageError.ServerError -> resources.getString(R.string.server_error)
        SearchImageError.Unknown -> resources.getString(R.string.generic_error)
    }
}
