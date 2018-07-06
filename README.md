# keras4j
Because we develop models using Keras, but should be able to use them from any JVM language! The project follows the [Semantic Versioning Convention](http://semver.org/), provides OSGi metadata and uses Apache 2.0 license.

[![Gitter Chat](http://img.shields.io/badge/chat-online-brightgreen.svg)](https://gitter.im/keras4j/)
[![Build Status](https://travis-ci.org/jmrozanec/cron-utils.png?branch=master)](https://travis-ci.org/jmrozanec/cron-utils)
[![Coverage Status](https://coveralls.io/repos/jmrozanec/cron-utils/badge.png)](https://coveralls.io/r/jmrozanec/cron-utils)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/35b1b558473d42c4980432a3ecf84f6c)](https://www.codacy.com/app/jmrozanec/cron-utils?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jmrozanec/cron-utils&amp;utm_campaign=Badge_Grade)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=cron-utils)](https://sonarcloud.io/dashboard/index/cron-utils)
[![Project stats by OpenHub](https://www.openhub.net/p/cron-utils/widgets/project_thin_badge.gif)](https://www.openhub.net/p/cron-utils/)

**Download**

keras4j will soon be available on [Maven central]() repository.

    <dependency>
        <groupId>com.bitscout</groupId>
        <artifactId>keras4j</artifactId>
        <version>0.1.0-SNAPSHOT</version>
    </dependency>


We aim to develop a library that would allow to load any Keras model persisted as hdf5 file and use it from any JVM language. 
We are not willing to develop a whole framework to train DNNs: use Keras to train it and Keras4j to use it.




Check:
    - activations: https://github.com/keras-team/keras/blob/master/keras/layers/advanced_activations.py
    -