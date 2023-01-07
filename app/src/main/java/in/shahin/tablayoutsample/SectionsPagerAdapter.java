package in.shahin.tablayoutsample;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import in.shahin.tablayoutsample.fragments.CricketFragment;
import in.shahin.tablayoutsample.fragments.DoctorFragment;
import in.shahin.tablayoutsample.fragments.WinterFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
/**https://developer.android.com/training/implementing-navigation/lateral*/
// NOTE : FragmentPagerAdapter uses when there is limited number of pages , else use FragmentStatePagerAdapter
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        /**Instead of passing same fragment multiple times pass different fragments for different tabs*/
        //NOTE : if its all are same type we can use same fragment, just pass the values to different positions as bundle using setArguments()
        Fragment selectedFragment = null;
        switch (position){
            case 0:
                selectedFragment = new CricketFragment();
                break;
            case 1:
                selectedFragment = new WinterFragment();
                break;
            case 2:
                selectedFragment = new DoctorFragment();
                break;
        }
        return selectedFragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

}
