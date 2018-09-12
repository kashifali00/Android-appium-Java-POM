package api.apps.Pliro;

import api.Interface.Application;
import api.android.Android;
import api.apps.Pliro.appointmentsPage.AppointmentsPage;
import api.apps.Pliro.changeHealthCenter.HealthCenterPage;
import api.apps.Pliro.changeRole.RolePage;
import api.apps.Pliro.codePage.CodePage;
import api.apps.Pliro.codePage.CodePageUiObject;
import api.apps.Pliro.congratulationsPage.CongratulationsPage;
import api.apps.Pliro.homeScreen.HomeScreenPage;
import api.apps.Pliro.loginPage.LoginPage;
import api.apps.Pliro.lookingForDoctorPage.LookingForDoctorPage;
import api.apps.Pliro.onboardingPage.OnboardingPage;
import api.apps.Pliro.pendingAppointment.PendingAppointmentPage;
import api.apps.Pliro.pendingPage.PendingPage;
import api.apps.Pliro.publicViewAppointmentPage.PublicViewAppointmentPage;
import api.apps.Pliro.publicViewAppointmentPage.PublicViewAppointmentUiObject;
import api.apps.Pliro.searchResults.SearchResultsPage;
import api.apps.Pliro.selectCriteria.SelectCriteriaPage;
import api.apps.Pliro.selectLocation.SelectLocationPage;
import api.apps.Pliro.settingsPage.SettingsPage;
import api.apps.Pliro.timeSchedule.TimeSchedulePage;

import java.util.Objects;

/**
 * Created by Kashif on 3/15/2018.
 */
public class Pliro implements Application {

    public OnboardingPage onboardingPage = new OnboardingPage();
    public LookingForDoctorPage lookingForDoctorPage = new LookingForDoctorPage();
    public LoginPage loginPage = new LoginPage();
    public HomeScreenPage HomeScreenPage = new HomeScreenPage();
    public SelectCriteriaPage selectCriteria = new SelectCriteriaPage();
    public SelectLocationPage selectLocation = new SelectLocationPage();
    public TimeSchedulePage timeSchedule = new TimeSchedulePage();
    public SearchResultsPage searchResults = new SearchResultsPage();
    public CongratulationsPage congratulationsPage = new CongratulationsPage();
    public SettingsPage settingsPage= new SettingsPage();
    public AppointmentsPage AppointmentsPage = new AppointmentsPage();
    public HealthCenterPage HealthCenterPage = new HealthCenterPage();
    public api.apps.Pliro.changeRole.RolePage RolePage = new RolePage();
    public api.apps.Pliro.pendingPage.PendingPage PendingPage =new PendingPage();
    public PendingAppointmentPage AppointmentConfirm = new PendingAppointmentPage();
    public PublicViewAppointmentUiObject publicViewAppointment =new PublicViewAppointmentUiObject();
    public PublicViewAppointmentPage PublicViewAppointmentPage = new PublicViewAppointmentPage();
    public CodePageUiObject codePageUiObject = new CodePageUiObject();
    public CodePage codePage = new CodePage();




    @Override
    public void forceStop() {
        Android.adb.forceStop(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Objects open() {
        Android.adb.openAppActivity(packageID(),activityID());
        return null;
    }

    @Override
    public String activityID() {
        return "com.pliro_mobile_2.SplashActivity";
    }

    @Override
    public String packageID() {
        return "com.aurora.pliro";
    }
}
