/*
 * Created by Xplo on 1/4/2016.
 * Must Need: MainApplication.java
 */

package xlib.matcolor.base;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class DbgUtils {

    private static final String TAG_POSTFIX = " xxx";

    /**
     * Method to show toast length short
     * @param s text to show
     */
    public static void pToast(String s) {
        Toast.makeText(Contextor.getInstance().getContext(), s, Toast.LENGTH_SHORT).show();
    }

    /**
     * Method to show toast length short and debug
     * @param s   text to show and debug
     * @param tag tag
     */
    public static void pToast(String s, String tag) {
        Log.d(tag, s);
        Toast.makeText(Contextor.getInstance().getContext(), s, Toast.LENGTH_SHORT).show();
    }

    /**
     * Method to get dynamic TAG from class name
     * @param className current class name. use context.getClass().getSimpleName()
     * @return TAG
     */
    public static String getTag(String className) {
        return className + TAG_POSTFIX;
    }

    /**
     * Method to get dynamic TAG from context
     * @param context use this or getActivity()
     * @return TAG
     */
    public static String getTag(Context context) {
        return context.getClass().getSimpleName() + TAG_POSTFIX;
    }

//    /**
//     * Method to show snack bar
//     *
//     * @param coordinatorLayout coordinator layout id
//     * @param msgText           The text to show
//     * @param duration          How long to display the message.  Either  #LENGTH_SHORT or #LENGTH_LONG
//     * @param actionText        actionText
//     */
//    public static void pSnackBar(final CoordinatorLayout coordinatorLayout, String msgText,
//                                 int duration, String actionText) {
//        //Snackbar snackbar = Snackbar.make(coordinatorLayout, s, duration);
//
//        Snackbar snackbar = Snackbar
//                .make(coordinatorLayout, msgText, duration)
//                .setAction(actionText, new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                    }
//                });
//
//        snackbar.show();
//    }
//
//
//    /**
//     * Method to show snack bar
//     *
//     * @param coordinatorLayout coordinator layout id
//     * @param msgText           The text to show
//     * @param duration          How long to display the message.  Either  #LENGTH_SHORT or #LENGTH_LONG
//     * @param actionText        actionText
//     * @param msgTextColor      msgTextColor
//     * @param actionTextColor   actionTextColor
//     */
//    public static void pSnackBar(final CoordinatorLayout coordinatorLayout, String msgText,
//                                 int duration, String actionText, int msgTextColor, int actionTextColor) {
//
//        Snackbar snackbar = Snackbar
//                .make(coordinatorLayout, msgText, duration)
//                .setAction(actionText, new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                    }
//                });
//
//        // Changing message text color
//        View sbView = snackbar.getView();
//        TextView textView = sbView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(msgTextColor);
//
//        // Changing action button text color
//        snackbar.setActionTextColor(actionTextColor);
//
//        snackbar.show();
//    }





}
