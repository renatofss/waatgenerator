String[] genderOptions = browser.getSelectOptions("id=SELECT_ID");
browser.select("id=SELECT_ID", "id=" + genderOptions[0]);