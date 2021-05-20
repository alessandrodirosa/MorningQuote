package com.alessandrodirosa.android.morningquote.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affermazione(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}