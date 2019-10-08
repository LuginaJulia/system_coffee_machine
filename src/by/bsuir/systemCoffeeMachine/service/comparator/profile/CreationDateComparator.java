package by.bsuir.systemCoffeeMachine.service.comparator.profile;

import by.bsuir.systemCoffeeMachine.annotation.ComparatorInfo;
import by.bsuir.systemCoffeeMachine.service.profile.Profile;
import java.util.Comparator;

@ComparatorInfo(name = "По времени создания",
        description = "Вначале ранее созданные профили")
public class CreationDateComparator implements Comparator<Profile> {
    @Override
    public int compare(Profile profile1, Profile profile2) {
        return profile1.getCreationDate().compareTo(profile2.getCreationDate());
    }
}
