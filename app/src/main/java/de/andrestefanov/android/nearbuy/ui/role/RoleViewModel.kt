package de.andrestefanov.android.nearbuy.ui.role

import androidx.lifecycle.ViewModel

class RoleViewModel : ViewModel() {

    enum class Role {
        HELPER,
        REQUESTER
    }

    fun setRole(role: Role) {
        // TODO:
    }

}
