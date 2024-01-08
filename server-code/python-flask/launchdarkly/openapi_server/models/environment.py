from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.environment_approval_settings import EnvironmentApprovalSettings
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.environment_approval_settings import EnvironmentApprovalSettings  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class Environment(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, links=None, api_key=None, approval_settings=None, color=None, confirm_changes=None, default_track_events=None, default_ttl=None, key=None, mobile_key=None, name=None, require_comments=None, secure_mode=None, tags=None):  # noqa: E501
        """Environment - a model defined in OpenAPI

        :param id: The id of this Environment.  # noqa: E501
        :type id: str
        :param links: The links of this Environment.  # noqa: E501
        :type links: Links
        :param api_key: The api_key of this Environment.  # noqa: E501
        :type api_key: str
        :param approval_settings: The approval_settings of this Environment.  # noqa: E501
        :type approval_settings: EnvironmentApprovalSettings
        :param color: The color of this Environment.  # noqa: E501
        :type color: str
        :param confirm_changes: The confirm_changes of this Environment.  # noqa: E501
        :type confirm_changes: bool
        :param default_track_events: The default_track_events of this Environment.  # noqa: E501
        :type default_track_events: bool
        :param default_ttl: The default_ttl of this Environment.  # noqa: E501
        :type default_ttl: float
        :param key: The key of this Environment.  # noqa: E501
        :type key: str
        :param mobile_key: The mobile_key of this Environment.  # noqa: E501
        :type mobile_key: str
        :param name: The name of this Environment.  # noqa: E501
        :type name: str
        :param require_comments: The require_comments of this Environment.  # noqa: E501
        :type require_comments: bool
        :param secure_mode: The secure_mode of this Environment.  # noqa: E501
        :type secure_mode: bool
        :param tags: The tags of this Environment.  # noqa: E501
        :type tags: List[str]
        """
        self.openapi_types = {
            'id': str,
            'links': Links,
            'api_key': str,
            'approval_settings': EnvironmentApprovalSettings,
            'color': str,
            'confirm_changes': bool,
            'default_track_events': bool,
            'default_ttl': float,
            'key': str,
            'mobile_key': str,
            'name': str,
            'require_comments': bool,
            'secure_mode': bool,
            'tags': List[str]
        }

        self.attribute_map = {
            'id': '_id',
            'links': '_links',
            'api_key': 'apiKey',
            'approval_settings': 'approvalSettings',
            'color': 'color',
            'confirm_changes': 'confirmChanges',
            'default_track_events': 'defaultTrackEvents',
            'default_ttl': 'defaultTtl',
            'key': 'key',
            'mobile_key': 'mobileKey',
            'name': 'name',
            'require_comments': 'requireComments',
            'secure_mode': 'secureMode',
            'tags': 'tags'
        }

        self._id = id
        self._links = links
        self._api_key = api_key
        self._approval_settings = approval_settings
        self._color = color
        self._confirm_changes = confirm_changes
        self._default_track_events = default_track_events
        self._default_ttl = default_ttl
        self._key = key
        self._mobile_key = mobile_key
        self._name = name
        self._require_comments = require_comments
        self._secure_mode = secure_mode
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'Environment':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Environment of this Environment.  # noqa: E501
        :rtype: Environment
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this Environment.

        The unique resource id.  # noqa: E501

        :return: The id of this Environment.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Environment.

        The unique resource id.  # noqa: E501

        :param id: The id of this Environment.
        :type id: str
        """

        self._id = id

    @property
    def links(self) -> Links:
        """Gets the links of this Environment.


        :return: The links of this Environment.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this Environment.


        :param links: The links of this Environment.
        :type links: Links
        """

        self._links = links

    @property
    def api_key(self) -> str:
        """Gets the api_key of this Environment.

        The SDK key for backend LaunchDarkly SDKs.  # noqa: E501

        :return: The api_key of this Environment.
        :rtype: str
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key: str):
        """Sets the api_key of this Environment.

        The SDK key for backend LaunchDarkly SDKs.  # noqa: E501

        :param api_key: The api_key of this Environment.
        :type api_key: str
        """

        self._api_key = api_key

    @property
    def approval_settings(self) -> EnvironmentApprovalSettings:
        """Gets the approval_settings of this Environment.


        :return: The approval_settings of this Environment.
        :rtype: EnvironmentApprovalSettings
        """
        return self._approval_settings

    @approval_settings.setter
    def approval_settings(self, approval_settings: EnvironmentApprovalSettings):
        """Sets the approval_settings of this Environment.


        :param approval_settings: The approval_settings of this Environment.
        :type approval_settings: EnvironmentApprovalSettings
        """

        self._approval_settings = approval_settings

    @property
    def color(self) -> str:
        """Gets the color of this Environment.

        The swatch color for the environment.  # noqa: E501

        :return: The color of this Environment.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this Environment.

        The swatch color for the environment.  # noqa: E501

        :param color: The color of this Environment.
        :type color: str
        """

        self._color = color

    @property
    def confirm_changes(self) -> bool:
        """Gets the confirm_changes of this Environment.

        Determines if this environment requires confirmation for flag and segment changes.  # noqa: E501

        :return: The confirm_changes of this Environment.
        :rtype: bool
        """
        return self._confirm_changes

    @confirm_changes.setter
    def confirm_changes(self, confirm_changes: bool):
        """Sets the confirm_changes of this Environment.

        Determines if this environment requires confirmation for flag and segment changes.  # noqa: E501

        :param confirm_changes: The confirm_changes of this Environment.
        :type confirm_changes: bool
        """

        self._confirm_changes = confirm_changes

    @property
    def default_track_events(self) -> bool:
        """Gets the default_track_events of this Environment.

        Set to true to send detailed event information for new flags.  # noqa: E501

        :return: The default_track_events of this Environment.
        :rtype: bool
        """
        return self._default_track_events

    @default_track_events.setter
    def default_track_events(self, default_track_events: bool):
        """Sets the default_track_events of this Environment.

        Set to true to send detailed event information for new flags.  # noqa: E501

        :param default_track_events: The default_track_events of this Environment.
        :type default_track_events: bool
        """

        self._default_track_events = default_track_events

    @property
    def default_ttl(self) -> float:
        """Gets the default_ttl of this Environment.

        The default TTL.  # noqa: E501

        :return: The default_ttl of this Environment.
        :rtype: float
        """
        return self._default_ttl

    @default_ttl.setter
    def default_ttl(self, default_ttl: float):
        """Sets the default_ttl of this Environment.

        The default TTL.  # noqa: E501

        :param default_ttl: The default_ttl of this Environment.
        :type default_ttl: float
        """

        self._default_ttl = default_ttl

    @property
    def key(self) -> str:
        """Gets the key of this Environment.

        The key for the environment.  # noqa: E501

        :return: The key of this Environment.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this Environment.

        The key for the environment.  # noqa: E501

        :param key: The key of this Environment.
        :type key: str
        """

        self._key = key

    @property
    def mobile_key(self) -> str:
        """Gets the mobile_key of this Environment.

        The SDK key for mobile LaunchDarkly SDKs.  # noqa: E501

        :return: The mobile_key of this Environment.
        :rtype: str
        """
        return self._mobile_key

    @mobile_key.setter
    def mobile_key(self, mobile_key: str):
        """Sets the mobile_key of this Environment.

        The SDK key for mobile LaunchDarkly SDKs.  # noqa: E501

        :param mobile_key: The mobile_key of this Environment.
        :type mobile_key: str
        """

        self._mobile_key = mobile_key

    @property
    def name(self) -> str:
        """Gets the name of this Environment.

        The name of the environment.  # noqa: E501

        :return: The name of this Environment.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Environment.

        The name of the environment.  # noqa: E501

        :param name: The name of this Environment.
        :type name: str
        """

        self._name = name

    @property
    def require_comments(self) -> bool:
        """Gets the require_comments of this Environment.

        Determines if this environment requires comments for flag and segment changes.  # noqa: E501

        :return: The require_comments of this Environment.
        :rtype: bool
        """
        return self._require_comments

    @require_comments.setter
    def require_comments(self, require_comments: bool):
        """Sets the require_comments of this Environment.

        Determines if this environment requires comments for flag and segment changes.  # noqa: E501

        :param require_comments: The require_comments of this Environment.
        :type require_comments: bool
        """

        self._require_comments = require_comments

    @property
    def secure_mode(self) -> bool:
        """Gets the secure_mode of this Environment.

        Determines if this environment is in safe mode.  # noqa: E501

        :return: The secure_mode of this Environment.
        :rtype: bool
        """
        return self._secure_mode

    @secure_mode.setter
    def secure_mode(self, secure_mode: bool):
        """Sets the secure_mode of this Environment.

        Determines if this environment is in safe mode.  # noqa: E501

        :param secure_mode: The secure_mode of this Environment.
        :type secure_mode: bool
        """

        self._secure_mode = secure_mode

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this Environment.

        An array of tags for this environment.  # noqa: E501

        :return: The tags of this Environment.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this Environment.

        An array of tags for this environment.  # noqa: E501

        :param tags: The tags of this Environment.
        :type tags: List[str]
        """

        self._tags = tags
