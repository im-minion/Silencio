package com.teamshunya.silencio.Classes;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by vaibhav on 2/4/17.
 */

public class myFCM extends FirebaseInstanceIdService {
    String tokengot;

    public myFCM() {

    }

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken;
        refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("asdasdasd", "Refreshed token: " + refreshedToken);
        tokengot=refreshedToken;

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.

//        DatabaseReference database = FirebaseDatabase.getInstance().getReference().child(StoreSession.getInstance().readPreferencesString("PNR", ""));
//        database.child("TOKEN").setValue(refreshedToken);
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {

   }
//    public void getthistoken(String comingpnr){
//        DatabaseReference database = FirebaseDatabase.getInstance().getReference().child(comingpnr);
//        database.child("TOKEN").setValue(tokengot);
//    }
    public String sendToken(){
        return tokengot;

    }


}
