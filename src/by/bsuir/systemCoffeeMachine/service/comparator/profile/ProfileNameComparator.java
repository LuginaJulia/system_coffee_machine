package by.bsuir.systemCoffeeMachine.service.comparator.profile;

import by.bsuir.systemCoffeeMachine.annotation.ComparatorInfo;
import by.bsuir.systemCoffeeMachine.service.profile.Profile;
import java.util.Comparator;

@ComparatorInfo(name = "По имени профиля",
        description = "В алфавитном порядке")
public class ProfileNameComparator implements Comparator<Profile> {
    @Override
    public int compare(Profile profile1, Profile profile2) {
        return profile1.getProfileName().compareTo(profile2.getProfileName());
    }
}
