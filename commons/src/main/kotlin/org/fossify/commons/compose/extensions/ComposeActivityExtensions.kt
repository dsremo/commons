package org.fossify.commons.compose.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import org.fossify.commons.R
import org.fossify.commons.compose.alert_dialog.rememberAlertDialogState
import org.fossify.commons.dialogs.ConfirmationAlertDialog
import org.fossify.commons.extensions.launchViewIntent

@Composable
fun FakeVersionCheck() {
    val context = LocalContext.current
    val confirmationDialogAlertDialogState = rememberAlertDialogState().apply {
        DialogMember {
            ConfirmationAlertDialog(
                alertDialogState = this,
                message = DSREMO_INTEGRITY_LABEL,
                positive = R.string.ok,
                negative = null
            ) {
                context.getActivity().launchViewIntent(DSREMO_COMMONS_URL)
            }
        }
    }
    LaunchedEffect(Unit) {
        context.dsremoIntegrityCheck(confirmationDialogAlertDialogState::show)
    }
}

@Composable
fun CheckAppOnSdCard() {
    val context = LocalContext.current.getComponentActivity()
    val confirmationDialogAlertDialogState = rememberAlertDialogState().apply {
        DialogMember {
            ConfirmationAlertDialog(
                alertDialogState = this,
                messageId = R.string.app_on_sd_card,
                positive = R.string.ok,
                negative = null
            ) {}
        }
    }
    LaunchedEffect(Unit) {
        context.appOnSdCardCheckCompose(confirmationDialogAlertDialogState::show)
    }
}
