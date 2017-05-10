package org.moe.binding.crashlytics.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSDate;
import apple.foundation.NSDictionary;

@Generated
@Library("Crashlytics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLSCrashReport")
public interface CLSCrashReport {
    @Generated
    @Selector("OSBuildVersion")
    String OSBuildVersion();

    @Generated
    @Selector("OSVersion")
    String OSVersion();

    @Generated
    @Selector("bundleShortVersionString")
    String bundleShortVersionString();

    @Generated
    @Selector("bundleVersion")
    String bundleVersion();

    @Generated
    @Selector("crashedOnDate")
    NSDate crashedOnDate();

    @Generated
    @Selector("customKeys")
    NSDictionary<?, ?> customKeys();

    @Generated
    @Selector("identifier")
    String identifier();
}