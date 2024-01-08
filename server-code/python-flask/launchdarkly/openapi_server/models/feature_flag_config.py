from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.fallthrough import Fallthrough
from openapi_server.models.prerequisite import Prerequisite
from openapi_server.models.rule import Rule
from openapi_server.models.site import Site
from openapi_server.models.target import Target
from openapi_server import util

from openapi_server.models.fallthrough import Fallthrough  # noqa: E501
from openapi_server.models.prerequisite import Prerequisite  # noqa: E501
from openapi_server.models.rule import Rule  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501
from openapi_server.models.target import Target  # noqa: E501

class FeatureFlagConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, environment_name=None, site=None, archived=None, fallthrough=None, last_modified=None, off_variation=None, _true=None, prerequisites=None, rules=None, salt=None, sel=None, targets=None, track_events=None, track_events_fallthrough=None, version=None):  # noqa: E501
        """FeatureFlagConfig - a model defined in OpenAPI

        :param environment_name: The environment_name of this FeatureFlagConfig.  # noqa: E501
        :type environment_name: str
        :param site: The site of this FeatureFlagConfig.  # noqa: E501
        :type site: Site
        :param archived: The archived of this FeatureFlagConfig.  # noqa: E501
        :type archived: bool
        :param fallthrough: The fallthrough of this FeatureFlagConfig.  # noqa: E501
        :type fallthrough: Fallthrough
        :param last_modified: The last_modified of this FeatureFlagConfig.  # noqa: E501
        :type last_modified: int
        :param off_variation: The off_variation of this FeatureFlagConfig.  # noqa: E501
        :type off_variation: int
        :param _true: The _true of this FeatureFlagConfig.  # noqa: E501
        :type _true: bool
        :param prerequisites: The prerequisites of this FeatureFlagConfig.  # noqa: E501
        :type prerequisites: List[Prerequisite]
        :param rules: The rules of this FeatureFlagConfig.  # noqa: E501
        :type rules: List[Rule]
        :param salt: The salt of this FeatureFlagConfig.  # noqa: E501
        :type salt: str
        :param sel: The sel of this FeatureFlagConfig.  # noqa: E501
        :type sel: str
        :param targets: The targets of this FeatureFlagConfig.  # noqa: E501
        :type targets: List[Target]
        :param track_events: The track_events of this FeatureFlagConfig.  # noqa: E501
        :type track_events: bool
        :param track_events_fallthrough: The track_events_fallthrough of this FeatureFlagConfig.  # noqa: E501
        :type track_events_fallthrough: bool
        :param version: The version of this FeatureFlagConfig.  # noqa: E501
        :type version: int
        """
        self.openapi_types = {
            'environment_name': str,
            'site': Site,
            'archived': bool,
            'fallthrough': Fallthrough,
            'last_modified': int,
            'off_variation': int,
            '_true': bool,
            'prerequisites': List[Prerequisite],
            'rules': List[Rule],
            'salt': str,
            'sel': str,
            'targets': List[Target],
            'track_events': bool,
            'track_events_fallthrough': bool,
            'version': int
        }

        self.attribute_map = {
            'environment_name': '_environmentName',
            'site': '_site',
            'archived': 'archived',
            'fallthrough': 'fallthrough',
            'last_modified': 'lastModified',
            'off_variation': 'offVariation',
            '_true': 'true',
            'prerequisites': 'prerequisites',
            'rules': 'rules',
            'salt': 'salt',
            'sel': 'sel',
            'targets': 'targets',
            'track_events': 'trackEvents',
            'track_events_fallthrough': 'trackEventsFallthrough',
            'version': 'version'
        }

        self._environment_name = environment_name
        self._site = site
        self._archived = archived
        self._fallthrough = fallthrough
        self._last_modified = last_modified
        self._off_variation = off_variation
        self.__true = _true
        self._prerequisites = prerequisites
        self._rules = rules
        self._salt = salt
        self._sel = sel
        self._targets = targets
        self._track_events = track_events
        self._track_events_fallthrough = track_events_fallthrough
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'FeatureFlagConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeatureFlagConfig of this FeatureFlagConfig.  # noqa: E501
        :rtype: FeatureFlagConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def environment_name(self) -> str:
        """Gets the environment_name of this FeatureFlagConfig.


        :return: The environment_name of this FeatureFlagConfig.
        :rtype: str
        """
        return self._environment_name

    @environment_name.setter
    def environment_name(self, environment_name: str):
        """Sets the environment_name of this FeatureFlagConfig.


        :param environment_name: The environment_name of this FeatureFlagConfig.
        :type environment_name: str
        """

        self._environment_name = environment_name

    @property
    def site(self) -> Site:
        """Gets the site of this FeatureFlagConfig.


        :return: The site of this FeatureFlagConfig.
        :rtype: Site
        """
        return self._site

    @site.setter
    def site(self, site: Site):
        """Sets the site of this FeatureFlagConfig.


        :param site: The site of this FeatureFlagConfig.
        :type site: Site
        """

        self._site = site

    @property
    def archived(self) -> bool:
        """Gets the archived of this FeatureFlagConfig.


        :return: The archived of this FeatureFlagConfig.
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived: bool):
        """Sets the archived of this FeatureFlagConfig.


        :param archived: The archived of this FeatureFlagConfig.
        :type archived: bool
        """

        self._archived = archived

    @property
    def fallthrough(self) -> Fallthrough:
        """Gets the fallthrough of this FeatureFlagConfig.


        :return: The fallthrough of this FeatureFlagConfig.
        :rtype: Fallthrough
        """
        return self._fallthrough

    @fallthrough.setter
    def fallthrough(self, fallthrough: Fallthrough):
        """Sets the fallthrough of this FeatureFlagConfig.


        :param fallthrough: The fallthrough of this FeatureFlagConfig.
        :type fallthrough: Fallthrough
        """

        self._fallthrough = fallthrough

    @property
    def last_modified(self) -> int:
        """Gets the last_modified of this FeatureFlagConfig.


        :return: The last_modified of this FeatureFlagConfig.
        :rtype: int
        """
        return self._last_modified

    @last_modified.setter
    def last_modified(self, last_modified: int):
        """Sets the last_modified of this FeatureFlagConfig.


        :param last_modified: The last_modified of this FeatureFlagConfig.
        :type last_modified: int
        """

        self._last_modified = last_modified

    @property
    def off_variation(self) -> int:
        """Gets the off_variation of this FeatureFlagConfig.


        :return: The off_variation of this FeatureFlagConfig.
        :rtype: int
        """
        return self._off_variation

    @off_variation.setter
    def off_variation(self, off_variation: int):
        """Sets the off_variation of this FeatureFlagConfig.


        :param off_variation: The off_variation of this FeatureFlagConfig.
        :type off_variation: int
        """

        self._off_variation = off_variation

    @property
    def _true(self) -> bool:
        """Gets the _true of this FeatureFlagConfig.


        :return: The _true of this FeatureFlagConfig.
        :rtype: bool
        """
        return self.__true

    @_true.setter
    def _true(self, _true: bool):
        """Sets the _true of this FeatureFlagConfig.


        :param _true: The _true of this FeatureFlagConfig.
        :type _true: bool
        """

        self.__true = _true

    @property
    def prerequisites(self) -> List[Prerequisite]:
        """Gets the prerequisites of this FeatureFlagConfig.


        :return: The prerequisites of this FeatureFlagConfig.
        :rtype: List[Prerequisite]
        """
        return self._prerequisites

    @prerequisites.setter
    def prerequisites(self, prerequisites: List[Prerequisite]):
        """Sets the prerequisites of this FeatureFlagConfig.


        :param prerequisites: The prerequisites of this FeatureFlagConfig.
        :type prerequisites: List[Prerequisite]
        """

        self._prerequisites = prerequisites

    @property
    def rules(self) -> List[Rule]:
        """Gets the rules of this FeatureFlagConfig.


        :return: The rules of this FeatureFlagConfig.
        :rtype: List[Rule]
        """
        return self._rules

    @rules.setter
    def rules(self, rules: List[Rule]):
        """Sets the rules of this FeatureFlagConfig.


        :param rules: The rules of this FeatureFlagConfig.
        :type rules: List[Rule]
        """

        self._rules = rules

    @property
    def salt(self) -> str:
        """Gets the salt of this FeatureFlagConfig.


        :return: The salt of this FeatureFlagConfig.
        :rtype: str
        """
        return self._salt

    @salt.setter
    def salt(self, salt: str):
        """Sets the salt of this FeatureFlagConfig.


        :param salt: The salt of this FeatureFlagConfig.
        :type salt: str
        """

        self._salt = salt

    @property
    def sel(self) -> str:
        """Gets the sel of this FeatureFlagConfig.


        :return: The sel of this FeatureFlagConfig.
        :rtype: str
        """
        return self._sel

    @sel.setter
    def sel(self, sel: str):
        """Sets the sel of this FeatureFlagConfig.


        :param sel: The sel of this FeatureFlagConfig.
        :type sel: str
        """

        self._sel = sel

    @property
    def targets(self) -> List[Target]:
        """Gets the targets of this FeatureFlagConfig.


        :return: The targets of this FeatureFlagConfig.
        :rtype: List[Target]
        """
        return self._targets

    @targets.setter
    def targets(self, targets: List[Target]):
        """Sets the targets of this FeatureFlagConfig.


        :param targets: The targets of this FeatureFlagConfig.
        :type targets: List[Target]
        """

        self._targets = targets

    @property
    def track_events(self) -> bool:
        """Gets the track_events of this FeatureFlagConfig.

        Set to true to send detailed event information for this flag.  # noqa: E501

        :return: The track_events of this FeatureFlagConfig.
        :rtype: bool
        """
        return self._track_events

    @track_events.setter
    def track_events(self, track_events: bool):
        """Sets the track_events of this FeatureFlagConfig.

        Set to true to send detailed event information for this flag.  # noqa: E501

        :param track_events: The track_events of this FeatureFlagConfig.
        :type track_events: bool
        """

        self._track_events = track_events

    @property
    def track_events_fallthrough(self) -> bool:
        """Gets the track_events_fallthrough of this FeatureFlagConfig.

        Set to true to send detailed event information when targeting is enabled but no individual targeting rule is matched.  # noqa: E501

        :return: The track_events_fallthrough of this FeatureFlagConfig.
        :rtype: bool
        """
        return self._track_events_fallthrough

    @track_events_fallthrough.setter
    def track_events_fallthrough(self, track_events_fallthrough: bool):
        """Sets the track_events_fallthrough of this FeatureFlagConfig.

        Set to true to send detailed event information when targeting is enabled but no individual targeting rule is matched.  # noqa: E501

        :param track_events_fallthrough: The track_events_fallthrough of this FeatureFlagConfig.
        :type track_events_fallthrough: bool
        """

        self._track_events_fallthrough = track_events_fallthrough

    @property
    def version(self) -> int:
        """Gets the version of this FeatureFlagConfig.


        :return: The version of this FeatureFlagConfig.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version: int):
        """Sets the version of this FeatureFlagConfig.


        :param version: The version of this FeatureFlagConfig.
        :type version: int
        """

        self._version = version