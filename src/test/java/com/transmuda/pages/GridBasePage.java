package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class GridBasePage {
    public GridBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
