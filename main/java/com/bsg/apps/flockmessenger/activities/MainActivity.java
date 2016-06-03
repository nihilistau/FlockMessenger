package com.bsg.apps.flockmessenger.activities;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.bsg.apps.flockmessenger.R;
import com.bsg.apps.flockmessenger.fragments.OneFragment;
import com.bsg.apps.flockmessenger.fragments.ThreeFragment;
import com.bsg.apps.flockmessenger.fragments.TwoFragment;
import com.google.firebase.iid.FirebaseInstanceId;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private int[] tabIcons = {
            R.drawable.ic_dashboard_black_36dp,
            R.drawable.ic_face_black_36dp,
            R.drawable.ic_tab_contacts
    };
    //private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    FragmentManager mFragmentManager;
    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;

    DrawerLayout drawerLayout;

    ActionBar actionBar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String tag = "Flock";
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        ActionBar actionBar;
        tabLayout = (TabLayout) findViewById(R.id.tabs);
       // tabLayout.setupWithViewPager(viewPager);

        /**
         * Setup the DrawerLayout and NavigationView
         */
//        mDrawerLayout = new DrawerLayout(this, null, 1);
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = new NavigationView(this, null, 1);
     //   mNavigationView = (NavigationView)findViewById(R.id.shitstuff) ;




        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
//        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
//                R.string.app_name);

//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //
//            }
//        };
//        mDrawerToggle.setToolbarNavigationClickListener(onClickListener);
        mFragmentManager = new FragmentManager() {
            @Override
            public FragmentTransaction beginTransaction() {
                return null;
            }

            @Override
            public boolean executePendingTransactions() {
                return false;
            }

            @Override
            public Fragment findFragmentById(@IdRes int id) {
                return null;
            }

            @Override
            public Fragment findFragmentByTag(String tag) {
                return null;
            }

            @Override
            public void popBackStack() {

            }

            @Override
            public boolean popBackStackImmediate() {
                return false;
            }

            @Override
            public void popBackStack(String name, int flags) {

            }

            @Override
            public boolean popBackStackImmediate(String name, int flags) {
                return false;
            }

            @Override
            public void popBackStack(int id, int flags) {

            }

            @Override
            public boolean popBackStackImmediate(int id, int flags) {
                return false;
            }

            @Override
            public int getBackStackEntryCount() {
                return 0;
            }

            @Override
            public BackStackEntry getBackStackEntryAt(int index) {
                return null;
            }

            @Override
            public void addOnBackStackChangedListener(OnBackStackChangedListener listener) {

            }

            @Override
            public void removeOnBackStackChangedListener(OnBackStackChangedListener listener) {

            }

            @Override
            public void putFragment(Bundle bundle, String key, Fragment fragment) {

            }

            @Override
            public Fragment getFragment(Bundle bundle, String key) {
                return null;
            }

            @Override
            public List<Fragment> getFragments() {
                return null;
            }

            @Override
            public Fragment.SavedState saveFragmentInstanceState(Fragment f) {
                return null;
            }

            @Override
            public boolean isDestroyed() {
                return false;
            }

            @Override
            public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {

            }
        };


        /**
         * Setup click events on the Navigation View Items.
         */

//        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(android.view.MenuItem item) {
//                mDrawerLayout.closeDrawers();
//                if (R.id.nav_item_sent == item.getItemId()) {
//                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
//                    fragmentTransaction.replace(R.id.containerView,new TwoFragment()).commit();
//
//                }
//
//                if (item.getItemId() == R.id.nav_item_inbox) {
//                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
//                    xfragmentTransaction.replace(R.id.containerView,new ThreeFragment()).commit();
//                }
//                if (item.getItemId() == R.id.nav_item_draft) {
//               //     Intent intent = new Intent(getBaseContext(), LoginActivity.class);
//                //    startActivity(intent);
//                }
//                if (item.getItemId() == R.id.nav_item_chatroom) {
//                  //  Intent intent = new Intent(getBaseContext(), ChatMainActivity.class);
//                   // startActivity(intent);
//                }
//
//                return false;
//            }
//        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

         toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);}
//         mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
//                R.string.app_name);
//        DrawerLayout.DrawerListener dListener = new DrawerLayout.DrawerListener() {
//            @Override
//            public void onDrawerSlide(View drawerView, float slideOffset) {
//
//            }
//
//            @Override
//            public void onDrawerOpened(View drawerView) {
//
//            }
//
//            @Override
//            public void onDrawerClosed(View drawerView) {
//
//            }
//
//            @Override
//            public void onDrawerStateChanged(int newState) {
//
//            }
//        };
//        mDrawerLayout.setDrawerListener(mDrawerToggle);
//        mDrawerLayout.addDrawerListener(dListener);
//        actionBar = new ActionBar() {
//            @Override
//            public void setCustomView(View view) {
//
//            }
//
//            @Override
//            public void setCustomView(View view, LayoutParams layoutParams) {
//
//            }
//
//            @Override
//            public void setCustomView(int resId) {
//
//            }
//
//            @Override
//            public void setIcon(@DrawableRes int resId) {
//
//            }
//
//            @Override
//            public void setIcon(Drawable icon) {
//
//            }
//
//            @Override
//            public void setLogo(@DrawableRes int resId) {
//
//            }
//
//            @Override
//            public void setLogo(Drawable logo) {
//
//            }
//
//            @Override
//            public void setListNavigationCallbacks(SpinnerAdapter adapter, OnNavigationListener callback) {
//
//            }
//
//            @Override
//            public void setSelectedNavigationItem(int position) {
//
//            }
//
//            @Override
//            public int getSelectedNavigationIndex() {
//                return 0;
//            }
//
//            @Override
//            public int getNavigationItemCount() {
//                return 0;
//            }
//
//            @Override
//            public void setTitle(CharSequence title) {
//
//            }
//
//            @Override
//            public void setTitle(@StringRes int resId) {
//
//            }
//
//            @Override
//            public void setSubtitle(CharSequence subtitle) {
//
//            }
//
//            @Override
//            public void setSubtitle(int resId) {
//
//            }
//
//            @Override
//            public void setDisplayOptions(int options) {
//
//            }
//
//            @Override
//            public void setDisplayOptions(int options, int mask) {
//
//            }
//
//            @Override
//            public void setDisplayUseLogoEnabled(boolean useLogo) {
//
//            }
//
//            @Override
//            public void setDisplayShowHomeEnabled(boolean showHome) {
//
//            }
//
//            @Override
//            public void setDisplayHomeAsUpEnabled(boolean showHomeAsUp) {
//
//            }
//
//            @Override
//            public void setDisplayShowTitleEnabled(boolean showTitle) {
//
//            }
//
//            @Override
//            public void setDisplayShowCustomEnabled(boolean showCustom) {
//
//            }
//
//            @Override
//            public void setBackgroundDrawable(@Nullable Drawable d) {
//
//            }
//
//            @Override
//            public View getCustomView() {
//                return null;
//            }
//
//            @Nullable
//            @Override
//            public CharSequence getTitle() {
//                return null;
//            }
//
//            @Nullable
//            @Override
//            public CharSequence getSubtitle() {
//                return null;
//            }


//            public int getNavigationMode() {
//                return NAVIGATION_MODE_STANDARD;
//
//            }
//
////                    @Override
////                    public int getNavigationMode() {
////                        return 1;
////                    }
//
//            @Override
//            public void setNavigationMode(int mode) {
//
//            }
//
//            @Override
//            public int getDisplayOptions() {
//                return 0;
//            }
//
//            @Override
//            public Tab newTab() {
//                return null;
//            }
//
//            @Override
//            public void addTab(Tab tab) {
//
//            }
//
//            @Override
//            public void addTab(Tab tab, boolean setSelected) {
//
//            }
//
//            @Override
//            public void addTab(Tab tab, int position) {
//
//            }
//
//            @Override
//            public void addTab(Tab tab, int position, boolean setSelected) {
//
//            }
//
//            @Override
//            public void removeTab(Tab tab) {
//
//            }
//
//            @Override
//            public void removeTabAt(int position) {
//
//            }
//
//            @Override
//            public void removeAllTabs() {
//
//            }
//
//            @Override
//            public void selectTab(Tab tab) {
//
//            }
//
//            @Nullable
//            @Override
//            public Tab getSelectedTab() {
//                return null;
//            }
//
//            @Override
//            public Tab getTabAt(int index) {
//                return null;
//            }
//
//            @Override
//            public int getTabCount() {
//                return 0;
//            }
//
//            @Override
//            public int getHeight() {
//                return 0;
//            }
//
//            @Override
//            public void show() {
//
//            }
//
//            @Override
//            public void hide() {
//
//            }
//
//            @Override
//            public boolean isShowing() {
//                return true;
//            }
//
//            @Override
//            public void addOnMenuVisibilityListener(OnMenuVisibilityListener listener) {
//
//            }
//
//            @Override
//            public void removeOnMenuVisibilityListener(OnMenuVisibilityListener listener) {
//
//            }
//
//        };
//
//        actionBar.setTitle("Flock");
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.show();
//
//        mDrawerToggle.syncState();
//        mDrawerLayout.closeDrawers();
//
//    }







    /**
     * Setup Tabs, and Pagers
     */

    private void setupTabIcons() {
            tabLayout.getTabAt(0).setIcon(tabIcons[0]);
            tabLayout.getTabAt(1).setIcon(tabIcons[1]);
            tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        viewPager.setAdapter(adapter);
//        setupTabIcons();
    }}


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }



        public void onTokenRefresh() {
            // Get updated InstanceID token.
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d("Flock", "Refreshed token: " + refreshedToken);

            // TODO: Implement this method to send any registration to your app's servers.
            sendRegistrationToServer(refreshedToken);
        }

        private void sendRegistrationToServer(String refreshedToken) {
            //
        }}
