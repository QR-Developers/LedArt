/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  cn.huidu.cloud.ui.program.fullcolor.CloudFCBaseProgramFragment
 *  cn.huidu.cloud.ui.program.fullcolor.CloudFCImagePickerFragment
 *  j4.c
 *  j4.e
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package b0;

import a0.l0;
import android.app.Activity;
import android.os.Bundle;
import cn.huidu.cloud.ui.program.fullcolor.CloudFCBaseProgramFragment;
import cn.huidu.cloud.ui.program.fullcolor.CloudFCImagePickerFragment;
import j4.c;
import j4.e;
import java.util.List;
import m4.b;

public class b
extends m4.b
implements c {
    public void a(List<e> list) {
        b.a a2;
        if (list != null && list.size() > 0 && (a2 = this.a) != null) {
            a2.j((e)list.get(0));
        }
    }

    @Override
    public void b(Activity activity) {
        CloudFCImagePickerFragment cloudFCImagePickerFragment = new CloudFCImagePickerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", 1);
        bundle.putInt("maxCount", 1);
        bundle.putInt("lastPage", 3);
        cloudFCImagePickerFragment.setArguments(bundle);
        cloudFCImagePickerFragment.D1((c)this);
        ((l0)activity).Q((CloudFCBaseProgramFragment)cloudFCImagePickerFragment, true);
    }
}

