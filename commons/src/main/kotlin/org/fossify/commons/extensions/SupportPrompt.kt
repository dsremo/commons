package org.fossify.commons.extensions

import android.app.Activity

// Upstream's monetisation: a Play rating prompt and a donation dialog for Fossify's own apps.
// Neither is ours to ask for. Made a no-op rather than deleted so DonateDialog and RateAppDialog
// stay compilable and the change stays reversible.
internal fun Activity.showAutomaticSupportPromptIfEligible() = Unit
