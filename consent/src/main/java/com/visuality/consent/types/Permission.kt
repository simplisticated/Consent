package com.visuality.consent.types

import android.Manifest
import android.os.Build
import androidx.annotation.RequiresApi

enum class Permission(
    val identifier: String
) {

    @RequiresApi(Build.VERSION_CODES.P)
    ACCEPT_HANDOVER(Manifest.permission.ACCEPT_HANDOVER),

    ACCESS_CHECKIN_PROPERTIES(Manifest.permission.ACCESS_CHECKIN_PROPERTIES),

    ACCESS_COARSE_LOCATION(Manifest.permission.ACCESS_COARSE_LOCATION),

    ACCESS_FINE_LOCATION(Manifest.permission.ACCESS_FINE_LOCATION),

    ACCESS_LOCATION_EXTRA_COMMANDS(Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS),

    ACCESS_NETWORK_STATE(Manifest.permission.ACCESS_NETWORK_STATE),

    ACCESS_NOTIFICATION_POLICY(Manifest.permission.ACCESS_NOTIFICATION_POLICY),

    ACCESS_WIFI_STATE(Manifest.permission.ACCESS_WIFI_STATE),

    ACCOUNT_MANAGER(Manifest.permission.ACCOUNT_MANAGER),

    ADD_VOICEMAIL(Manifest.permission.ADD_VOICEMAIL),

    @RequiresApi(Build.VERSION_CODES.O)
    ANSWER_PHONE_CALLS(Manifest.permission.ANSWER_PHONE_CALLS),

    BATTERY_STATS(Manifest.permission.BATTERY_STATS),

    BIND_ACCESSIBILITY_SERVICE(Manifest.permission.BIND_ACCESSIBILITY_SERVICE),

    BIND_APPWIDGET(Manifest.permission.BIND_APPWIDGET),

    @RequiresApi(Build.VERSION_CODES.O)
    BIND_AUTOFILL_SERVICE(Manifest.permission.BIND_AUTOFILL_SERVICE),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    BIND_CARRIER_MESSAGING_SERVICE(Manifest.permission.BIND_CARRIER_MESSAGING_SERVICE),

    BIND_CARRIER_SERVICES(Manifest.permission.BIND_CARRIER_SERVICES),

    BIND_CHOOSER_TARGET_SERVICE(Manifest.permission.BIND_CHOOSER_TARGET_SERVICE),

    @RequiresApi(Build.VERSION_CODES.N)
    BIND_CONDITION_PROVIDER_SERVICE(Manifest.permission.BIND_CONDITION_PROVIDER_SERVICE),

    BIND_DEVICE_ADMIN(Manifest.permission.BIND_DEVICE_ADMIN),

    BIND_DREAM_SERVICE(Manifest.permission.BIND_DREAM_SERVICE),

    BIND_INCALL_SERVICE(Manifest.permission.BIND_INCALL_SERVICE),

    BIND_INPUT_METHOD(Manifest.permission.BIND_INPUT_METHOD),

    BIND_MIDI_DEVICE_SERVICE(Manifest.permission.BIND_MIDI_DEVICE_SERVICE),

    BIND_NFC_SERVICE(Manifest.permission.BIND_NFC_SERVICE),

    BIND_NOTIFICATION_LISTENER_SERVICE(Manifest.permission.BIND_NOTIFICATION_LISTENER_SERVICE),

    BIND_PRINT_SERVICE(Manifest.permission.BIND_PRINT_SERVICE),

    @RequiresApi(Build.VERSION_CODES.N)
    BIND_QUICK_SETTINGS_TILE(Manifest.permission.BIND_QUICK_SETTINGS_TILE),

    BIND_REMOTEVIEWS(Manifest.permission.BIND_REMOTEVIEWS),

    @RequiresApi(Build.VERSION_CODES.N)
    BIND_SCREENING_SERVICE(Manifest.permission.BIND_SCREENING_SERVICE),

    BIND_TELECOM_CONNECTION_SERVICE(Manifest.permission.BIND_TELECOM_CONNECTION_SERVICE),

    BIND_TEXT_SERVICE(Manifest.permission.BIND_TEXT_SERVICE),

    BIND_TV_INPUT(Manifest.permission.BIND_TV_INPUT),

    @RequiresApi(Build.VERSION_CODES.O)
    BIND_VISUAL_VOICEMAIL_SERVICE(Manifest.permission.BIND_VISUAL_VOICEMAIL_SERVICE),

    BIND_VOICE_INTERACTION(Manifest.permission.BIND_VOICE_INTERACTION),

    BIND_VPN_SERVICE(Manifest.permission.BIND_VPN_SERVICE),

    @RequiresApi(Build.VERSION_CODES.N)
    BIND_VR_LISTENER_SERVICE(Manifest.permission.BIND_VR_LISTENER_SERVICE),

    BIND_WALLPAPER(Manifest.permission.BIND_WALLPAPER),

    BLUETOOTH(Manifest.permission.BLUETOOTH),

    BLUETOOTH_ADMIN(Manifest.permission.BLUETOOTH_ADMIN),

    BLUETOOTH_PRIVILEGED(Manifest.permission.BLUETOOTH_PRIVILEGED),

    BODY_SENSORS(Manifest.permission.BODY_SENSORS),

    BROADCAST_PACKAGE_REMOVED(Manifest.permission.BROADCAST_PACKAGE_REMOVED),

    BROADCAST_SMS(Manifest.permission.BROADCAST_SMS),

    BROADCAST_STICKY(Manifest.permission.BROADCAST_STICKY),

    BROADCAST_WAP_PUSH(Manifest.permission.BROADCAST_WAP_PUSH),

    CALL_PHONE(Manifest.permission.CALL_PHONE),

    CALL_PRIVILEGED(Manifest.permission.CALL_PRIVILEGED),

    CAMERA(Manifest.permission.CAMERA),

    CAPTURE_AUDIO_OUTPUT(Manifest.permission.CAPTURE_AUDIO_OUTPUT),

    CAPTURE_SECURE_VIDEO_OUTPUT(Manifest.permission.CAPTURE_SECURE_VIDEO_OUTPUT),

    CAPTURE_VIDEO_OUTPUT(Manifest.permission.CAPTURE_VIDEO_OUTPUT),

    CHANGE_COMPONENT_ENABLED_STATE(Manifest.permission.CHANGE_COMPONENT_ENABLED_STATE),

    CHANGE_CONFIGURATION(Manifest.permission.CHANGE_CONFIGURATION),

    CHANGE_NETWORK_STATE(Manifest.permission.CHANGE_NETWORK_STATE),

    CHANGE_WIFI_MULTICAST_STATE(Manifest.permission.CHANGE_WIFI_MULTICAST_STATE),

    CHANGE_WIFI_STATE(Manifest.permission.CHANGE_WIFI_STATE),

    CLEAR_APP_CACHE(Manifest.permission.CLEAR_APP_CACHE),

    CONTROL_LOCATION_UPDATES(Manifest.permission.CONTROL_LOCATION_UPDATES),

    DELETE_CACHE_FILES(Manifest.permission.DELETE_CACHE_FILES),

    DELETE_PACKAGES(Manifest.permission.DELETE_PACKAGES),

    DIAGNOSTIC(Manifest.permission.DIAGNOSTIC),

    DISABLE_KEYGUARD(Manifest.permission.DISABLE_KEYGUARD),

    DUMP(Manifest.permission.DUMP),

    EXPAND_STATUS_BAR(Manifest.permission.EXPAND_STATUS_BAR),

    FACTORY_TEST(Manifest.permission.FACTORY_TEST),

    @RequiresApi(Build.VERSION_CODES.P)
    FOREGROUND_SERVICE(Manifest.permission.FOREGROUND_SERVICE),

    GET_ACCOUNTS(Manifest.permission.GET_ACCOUNTS),

    GET_ACCOUNTS_PRIVILEGED(Manifest.permission.GET_ACCOUNTS_PRIVILEGED),

    GET_PACKAGE_SIZE(Manifest.permission.GET_PACKAGE_SIZE),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    GET_TASKS(Manifest.permission.GET_TASKS),

    GLOBAL_SEARCH(Manifest.permission.GLOBAL_SEARCH),

    INSTALL_LOCATION_PROVIDER(Manifest.permission.INSTALL_LOCATION_PROVIDER),

    INSTALL_PACKAGES(Manifest.permission.INSTALL_PACKAGES),

    INSTALL_SHORTCUT(Manifest.permission.INSTALL_SHORTCUT),

    @RequiresApi(Build.VERSION_CODES.O)
    INSTANT_APP_FOREGROUND_SERVICE(Manifest.permission.INSTANT_APP_FOREGROUND_SERVICE),

    INTERNET(Manifest.permission.INTERNET),

    KILL_BACKGROUND_PROCESSES(Manifest.permission.KILL_BACKGROUND_PROCESSES),

    LOCATION_HARDWARE(Manifest.permission.LOCATION_HARDWARE),

    MANAGE_DOCUMENTS(Manifest.permission.MANAGE_DOCUMENTS),

    @RequiresApi(Build.VERSION_CODES.O)
    MANAGE_OWN_CALLS(Manifest.permission.MANAGE_OWN_CALLS),

    MASTER_CLEAR(Manifest.permission.MASTER_CLEAR),

    MEDIA_CONTENT_CONTROL(Manifest.permission.MEDIA_CONTENT_CONTROL),

    MODIFY_AUDIO_SETTINGS(Manifest.permission.MODIFY_AUDIO_SETTINGS),

    MODIFY_PHONE_STATE(Manifest.permission.MODIFY_PHONE_STATE),

    MOUNT_FORMAT_FILESYSTEMS(Manifest.permission.MOUNT_FORMAT_FILESYSTEMS),

    MOUNT_UNMOUNT_FILESYSTEMS(Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS),

    NFC(Manifest.permission.NFC),

    @RequiresApi(Build.VERSION_CODES.P)
    NFC_TRANSACTION_EVENT(Manifest.permission.NFC_TRANSACTION_EVENT),

    PACKAGE_USAGE_STATS(Manifest.permission.PACKAGE_USAGE_STATS),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    PERSISTENT_ACTIVITY(Manifest.permission.PERSISTENT_ACTIVITY),

    PROCESS_OUTGOING_CALLS(Manifest.permission.PROCESS_OUTGOING_CALLS),

    READ_CALENDAR(Manifest.permission.READ_CALENDAR),

    READ_CALL_LOG(Manifest.permission.READ_CALL_LOG),

    READ_CONTACTS(Manifest.permission.READ_CONTACTS),

    READ_EXTERNAL_STORAGE(Manifest.permission.READ_EXTERNAL_STORAGE),

    READ_FRAME_BUFFER(Manifest.permission.READ_FRAME_BUFFER),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    READ_INPUT_STATE(Manifest.permission.READ_INPUT_STATE),

    READ_LOGS(Manifest.permission.READ_LOGS),

    @RequiresApi(Build.VERSION_CODES.O)
    READ_PHONE_NUMBERS(Manifest.permission.READ_PHONE_NUMBERS),

    READ_PHONE_STATE(Manifest.permission.READ_PHONE_STATE),

    READ_SMS(Manifest.permission.READ_SMS),

    READ_SYNC_SETTINGS(Manifest.permission.READ_SYNC_SETTINGS),

    READ_SYNC_STATS(Manifest.permission.READ_SYNC_STATS),

    READ_VOICEMAIL(Manifest.permission.READ_VOICEMAIL),

    REBOOT(Manifest.permission.REBOOT),

    RECEIVE_BOOT_COMPLETED(Manifest.permission.RECEIVE_BOOT_COMPLETED),

    RECEIVE_MMS(Manifest.permission.RECEIVE_MMS),

    RECEIVE_SMS(Manifest.permission.RECEIVE_SMS),

    RECEIVE_WAP_PUSH(Manifest.permission.RECEIVE_WAP_PUSH),

    RECORD_AUDIO(Manifest.permission.RECORD_AUDIO),

    REORDER_TASKS(Manifest.permission.REORDER_TASKS),

    @RequiresApi(Build.VERSION_CODES.O)
    REQUEST_COMPANION_RUN_IN_BACKGROUND(Manifest.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND),

    @RequiresApi(Build.VERSION_CODES.O)
    REQUEST_COMPANION_USE_DATA_IN_BACKGROUND(Manifest.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND),

    @RequiresApi(Build.VERSION_CODES.O)
    REQUEST_DELETE_PACKAGES(Manifest.permission.REQUEST_DELETE_PACKAGES),

    REQUEST_IGNORE_BATTERY_OPTIMIZATIONS(Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS),

    REQUEST_INSTALL_PACKAGES(Manifest.permission.REQUEST_INSTALL_PACKAGES),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    RESTART_PACKAGES(Manifest.permission.RESTART_PACKAGES),

    SEND_RESPOND_VIA_MESSAGE(Manifest.permission.SEND_RESPOND_VIA_MESSAGE),

    SEND_SMS(Manifest.permission.SEND_SMS),

    SET_ALARM(Manifest.permission.SET_ALARM),

    SET_ALWAYS_FINISH(Manifest.permission.SET_ALWAYS_FINISH),

    SET_ANIMATION_SCALE(Manifest.permission.SET_ANIMATION_SCALE),

    SET_DEBUG_APP(Manifest.permission.SET_DEBUG_APP),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    SET_PREFERRED_APPLICATIONS(Manifest.permission.SET_PREFERRED_APPLICATIONS),

    SET_PROCESS_LIMIT(Manifest.permission.SET_PROCESS_LIMIT),

    SET_TIME(Manifest.permission.SET_TIME),

    SET_TIME_ZONE(Manifest.permission.SET_TIME_ZONE),

    SET_WALLPAPER(Manifest.permission.SET_WALLPAPER),

    SET_WALLPAPER_HINTS(Manifest.permission.SET_WALLPAPER_HINTS),

    SIGNAL_PERSISTENT_PROCESSES(Manifest.permission.SIGNAL_PERSISTENT_PROCESSES),

    STATUS_BAR(Manifest.permission.STATUS_BAR),

    SYSTEM_ALERT_WINDOW(Manifest.permission.SYSTEM_ALERT_WINDOW),

    TRANSMIT_IR(Manifest.permission.TRANSMIT_IR),

    UNINSTALL_SHORTCUT(Manifest.permission.UNINSTALL_SHORTCUT),

    UPDATE_DEVICE_STATS(Manifest.permission.UPDATE_DEVICE_STATS),

    @RequiresApi(Build.VERSION_CODES.P)
    USE_BIOMETRIC(Manifest.permission.USE_BIOMETRIC),

    @Deprecated(message = "", level = DeprecationLevel.WARNING)
    USE_FINGERPRINT(Manifest.permission.USE_FINGERPRINT),

    USE_SIP(Manifest.permission.USE_SIP),

    VIBRATE(Manifest.permission.VIBRATE),

    WAKE_LOCK(Manifest.permission.WAKE_LOCK),

    WRITE_APN_SETTINGS(Manifest.permission.WRITE_APN_SETTINGS),

    WRITE_CALENDAR(Manifest.permission.WRITE_CALENDAR),

    WRITE_CALL_LOG(Manifest.permission.WRITE_CALL_LOG),

    WRITE_CONTACTS(Manifest.permission.WRITE_CONTACTS),

    WRITE_EXTERNAL_STORAGE(Manifest.permission.WRITE_EXTERNAL_STORAGE),

    WRITE_GSERVICES(Manifest.permission.WRITE_GSERVICES),

    WRITE_SECURE_SETTINGS(Manifest.permission.WRITE_SECURE_SETTINGS),

    WRITE_SETTINGS(Manifest.permission.WRITE_SETTINGS),

    WRITE_SYNC_SETTINGS(Manifest.permission.WRITE_SYNC_SETTINGS),

    WRITE_VOICEMAIL(Manifest.permission.WRITE_VOICEMAIL)
}

internal fun permissionByIdentifier(name: String): Permission? = Permission.values()
    .filter { it.identifier == name }
    .firstOrNull()
