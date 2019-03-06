package kotlintutorial.com.kotlintutorial.data

import kotlintutorial.com.kotlintutorial.view.Company


class Dummy() {
    companion object {
        fun getCompanies(): MutableList<Company> {
            return mutableListOf(
                    Company("Google", "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png", 1998),
                    Company("Youtube", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/YouTube_Logo.svg/2000px-YouTube_Logo.svg.png", 2005),
                    Company("Apple", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/2000px-Apple_logo_black.svg.png", 1976),
                    Company("IBM", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/1280px-IBM_logo.svg.png", 1911),
                    Company("Twitter", "https://upload.wikimedia.org/wikipedia/tr/thumb/f/f2/Twitter-bird-light-bgs.png/220px-Twitter-bird-light-bgs.png", 2006),
                    Company("Medium", "https://upload.wikimedia.org/wikipedia/tr/f/fa/Medium_logo.png", 2012),
                    Company("Facebook", "http://pngimg.com/uploads/facebook_logos/facebook_logos_PNG19756.png", 2006),
                    Company("Pied Piper", "http://static.squarespace.com/static/531f2c4ee4b002f5b011bf00/t/536bdcefe4b03580f8f6bb16/1399577848961/hbosiliconvalleypiedpiperoldlogo", 2015),
                    Company("Wikipedia", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Wikipedia_Logo_1.0.png/220px-Wikipedia_Logo_1.0.png", 2001)
            )
        }
    }
}