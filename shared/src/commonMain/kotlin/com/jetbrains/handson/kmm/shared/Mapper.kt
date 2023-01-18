package com.jetbrains.handson.kmm.shared

import com.example.kmmexample.models.*

fun List<Base>.toRocket() : List<RocketLaunch>{
    val mutableRocket = mutableListOf<RocketLaunch>()
    forEach {
        mutableRocket.add(
            RocketLaunch(
                flightNumber = it.flight_number,
                missionName = it.id,
                launchYear = it.date_unix,
                launchDateUTC = it.date_utc,
                rocket = Rocket(
                    it.rocket,
                    it.name,
                    ""

                ),
                details = it.details,
                links = it.links.toLinksMapper(),
                launchSuccess = true
            )
        )
    }
    return mutableRocket
}

fun Links.toLinksMapper() : LinksMapper{
    return LinksMapper(
        missionPatchUrl = wikipedia,
        articleUrl = article
    )
}