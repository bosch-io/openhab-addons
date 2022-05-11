# BoschSpexor Binding

In short what is spexor: spexor is a smart IoT device that enables you to observe your environment by measuring this different kind of embedded sensors. It is a mobile device and can be used in Europe on your travels but also at home, in your garden shelter or wherever you want to use it. It only needs a WiFi connection or mobile network to connect. If you would like to get more details, we recommend visiting our website https://www.spexor-bosch.com 13.

With the new add-on for openHAB we would like to enable your smart home or maybe your smart mobile environment to get connected to your other systems and enable new possibilities.
Getting an indication of your air quality and visualizing this via your smart light bulbs or just getting a voice reminder if it got to a certain level could be an option. You can also enable the burglary on defined rules as you like and play sounds or do other stuff if the spexor has observed an intrusion.

It’s on you being creative without borders to enable the world of the Bosch spexor to get it integrated into your smart X.

Let us know what you have achieved with your custom setup. Maybe you help others to get also inspired too.

## Supported Things

This plugin supports the first generation of Bosch spexor

## Discovery

The spexor discovery service will automatically find owned things.
To enable this you have to visit the servlet page http://<<yourOPENHAB>>:<yourOPENHABport>>/spexor it will guide you through the setup.

Just create the Bosch spexor Brigde as a Thing


## Binding Configuration

no additional configuration needed. 

## Thing Configuration

The spexor thing can be configured by setting up an refresh interval.
The spexor contains 3 properties

| property                  | type   | description                                                              | editable      |
|---------------------------|--------|--------------------------------------------------------------------------|---------------|
| spexor ID                 | ID     | identifies the thing                                                     | no            |
| spexor Name               | String | given Name of the spexor                                                 | no            |
| spexor refresh interval   | number | defintion how often a spexor should check his state with the spexor API  | yes           |
                                       

## Channels

Defintion and explanation of the channels is provided in the UI.
To change the observation of Burglary or other (Observation Type Burglary) you can change the state (BurglaryState f.e.) by selecting the values *deactivated* or *activated*. A drop down menu should be available via the UI.

