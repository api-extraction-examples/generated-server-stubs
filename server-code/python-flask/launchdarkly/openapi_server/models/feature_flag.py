from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.client_side_availability import ClientSideAvailability
from openapi_server.models.custom_property import CustomProperty
from openapi_server.models.defaults import Defaults
from openapi_server.models.feature_flag_config import FeatureFlagConfig
from openapi_server.models.links import Links
from openapi_server.models.member import Member
from openapi_server.models.variation import Variation
from openapi_server import util

from openapi_server.models.client_side_availability import ClientSideAvailability  # noqa: E501
from openapi_server.models.custom_property import CustomProperty  # noqa: E501
from openapi_server.models.defaults import Defaults  # noqa: E501
from openapi_server.models.feature_flag_config import FeatureFlagConfig  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501
from openapi_server.models.member import Member  # noqa: E501
from openapi_server.models.variation import Variation  # noqa: E501

class FeatureFlag(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, maintainer=None, version=None, archived=None, archived_date=None, client_side_availability=None, creation_date=None, custom_properties=None, defaults=None, description=None, environments=None, goal_ids=None, include_in_snippet=None, key=None, kind=None, maintainer_id=None, name=None, tags=None, temporary=None, variations=None):  # noqa: E501
        """FeatureFlag - a model defined in OpenAPI

        :param links: The links of this FeatureFlag.  # noqa: E501
        :type links: Links
        :param maintainer: The maintainer of this FeatureFlag.  # noqa: E501
        :type maintainer: Member
        :param version: The version of this FeatureFlag.  # noqa: E501
        :type version: int
        :param archived: The archived of this FeatureFlag.  # noqa: E501
        :type archived: bool
        :param archived_date: The archived_date of this FeatureFlag.  # noqa: E501
        :type archived_date: int
        :param client_side_availability: The client_side_availability of this FeatureFlag.  # noqa: E501
        :type client_side_availability: ClientSideAvailability
        :param creation_date: The creation_date of this FeatureFlag.  # noqa: E501
        :type creation_date: int
        :param custom_properties: The custom_properties of this FeatureFlag.  # noqa: E501
        :type custom_properties: Dict[str, CustomProperty]
        :param defaults: The defaults of this FeatureFlag.  # noqa: E501
        :type defaults: Defaults
        :param description: The description of this FeatureFlag.  # noqa: E501
        :type description: str
        :param environments: The environments of this FeatureFlag.  # noqa: E501
        :type environments: Dict[str, FeatureFlagConfig]
        :param goal_ids: The goal_ids of this FeatureFlag.  # noqa: E501
        :type goal_ids: List[str]
        :param include_in_snippet: The include_in_snippet of this FeatureFlag.  # noqa: E501
        :type include_in_snippet: bool
        :param key: The key of this FeatureFlag.  # noqa: E501
        :type key: str
        :param kind: The kind of this FeatureFlag.  # noqa: E501
        :type kind: str
        :param maintainer_id: The maintainer_id of this FeatureFlag.  # noqa: E501
        :type maintainer_id: str
        :param name: The name of this FeatureFlag.  # noqa: E501
        :type name: str
        :param tags: The tags of this FeatureFlag.  # noqa: E501
        :type tags: List[str]
        :param temporary: The temporary of this FeatureFlag.  # noqa: E501
        :type temporary: bool
        :param variations: The variations of this FeatureFlag.  # noqa: E501
        :type variations: List[Variation]
        """
        self.openapi_types = {
            'links': Links,
            'maintainer': Member,
            'version': int,
            'archived': bool,
            'archived_date': int,
            'client_side_availability': ClientSideAvailability,
            'creation_date': int,
            'custom_properties': Dict[str, CustomProperty],
            'defaults': Defaults,
            'description': str,
            'environments': Dict[str, FeatureFlagConfig],
            'goal_ids': List[str],
            'include_in_snippet': bool,
            'key': str,
            'kind': str,
            'maintainer_id': str,
            'name': str,
            'tags': List[str],
            'temporary': bool,
            'variations': List[Variation]
        }

        self.attribute_map = {
            'links': '_links',
            'maintainer': '_maintainer',
            'version': '_version',
            'archived': 'archived',
            'archived_date': 'archivedDate',
            'client_side_availability': 'clientSideAvailability',
            'creation_date': 'creationDate',
            'custom_properties': 'customProperties',
            'defaults': 'defaults',
            'description': 'description',
            'environments': 'environments',
            'goal_ids': 'goalIds',
            'include_in_snippet': 'includeInSnippet',
            'key': 'key',
            'kind': 'kind',
            'maintainer_id': 'maintainerId',
            'name': 'name',
            'tags': 'tags',
            'temporary': 'temporary',
            'variations': 'variations'
        }

        self._links = links
        self._maintainer = maintainer
        self._version = version
        self._archived = archived
        self._archived_date = archived_date
        self._client_side_availability = client_side_availability
        self._creation_date = creation_date
        self._custom_properties = custom_properties
        self._defaults = defaults
        self._description = description
        self._environments = environments
        self._goal_ids = goal_ids
        self._include_in_snippet = include_in_snippet
        self._key = key
        self._kind = kind
        self._maintainer_id = maintainer_id
        self._name = name
        self._tags = tags
        self._temporary = temporary
        self._variations = variations

    @classmethod
    def from_dict(cls, dikt) -> 'FeatureFlag':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeatureFlag of this FeatureFlag.  # noqa: E501
        :rtype: FeatureFlag
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this FeatureFlag.


        :return: The links of this FeatureFlag.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this FeatureFlag.


        :param links: The links of this FeatureFlag.
        :type links: Links
        """

        self._links = links

    @property
    def maintainer(self) -> Member:
        """Gets the maintainer of this FeatureFlag.


        :return: The maintainer of this FeatureFlag.
        :rtype: Member
        """
        return self._maintainer

    @maintainer.setter
    def maintainer(self, maintainer: Member):
        """Sets the maintainer of this FeatureFlag.


        :param maintainer: The maintainer of this FeatureFlag.
        :type maintainer: Member
        """

        self._maintainer = maintainer

    @property
    def version(self) -> int:
        """Gets the version of this FeatureFlag.


        :return: The version of this FeatureFlag.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version: int):
        """Sets the version of this FeatureFlag.


        :param version: The version of this FeatureFlag.
        :type version: int
        """

        self._version = version

    @property
    def archived(self) -> bool:
        """Gets the archived of this FeatureFlag.

        Whether or not this flag is archived.  # noqa: E501

        :return: The archived of this FeatureFlag.
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived: bool):
        """Sets the archived of this FeatureFlag.

        Whether or not this flag is archived.  # noqa: E501

        :param archived: The archived of this FeatureFlag.
        :type archived: bool
        """

        self._archived = archived

    @property
    def archived_date(self) -> int:
        """Gets the archived_date of this FeatureFlag.

        A unix epoch time in milliseconds specifying the archived time of this flag.  # noqa: E501

        :return: The archived_date of this FeatureFlag.
        :rtype: int
        """
        return self._archived_date

    @archived_date.setter
    def archived_date(self, archived_date: int):
        """Sets the archived_date of this FeatureFlag.

        A unix epoch time in milliseconds specifying the archived time of this flag.  # noqa: E501

        :param archived_date: The archived_date of this FeatureFlag.
        :type archived_date: int
        """

        self._archived_date = archived_date

    @property
    def client_side_availability(self) -> ClientSideAvailability:
        """Gets the client_side_availability of this FeatureFlag.


        :return: The client_side_availability of this FeatureFlag.
        :rtype: ClientSideAvailability
        """
        return self._client_side_availability

    @client_side_availability.setter
    def client_side_availability(self, client_side_availability: ClientSideAvailability):
        """Sets the client_side_availability of this FeatureFlag.


        :param client_side_availability: The client_side_availability of this FeatureFlag.
        :type client_side_availability: ClientSideAvailability
        """

        self._client_side_availability = client_side_availability

    @property
    def creation_date(self) -> int:
        """Gets the creation_date of this FeatureFlag.

        A unix epoch time in milliseconds specifying the creation time of this flag.  # noqa: E501

        :return: The creation_date of this FeatureFlag.
        :rtype: int
        """
        return self._creation_date

    @creation_date.setter
    def creation_date(self, creation_date: int):
        """Sets the creation_date of this FeatureFlag.

        A unix epoch time in milliseconds specifying the creation time of this flag.  # noqa: E501

        :param creation_date: The creation_date of this FeatureFlag.
        :type creation_date: int
        """

        self._creation_date = creation_date

    @property
    def custom_properties(self) -> Dict[str, CustomProperty]:
        """Gets the custom_properties of this FeatureFlag.

        A mapping of keys to CustomProperty entries.  # noqa: E501

        :return: The custom_properties of this FeatureFlag.
        :rtype: Dict[str, CustomProperty]
        """
        return self._custom_properties

    @custom_properties.setter
    def custom_properties(self, custom_properties: Dict[str, CustomProperty]):
        """Sets the custom_properties of this FeatureFlag.

        A mapping of keys to CustomProperty entries.  # noqa: E501

        :param custom_properties: The custom_properties of this FeatureFlag.
        :type custom_properties: Dict[str, CustomProperty]
        """

        self._custom_properties = custom_properties

    @property
    def defaults(self) -> Defaults:
        """Gets the defaults of this FeatureFlag.


        :return: The defaults of this FeatureFlag.
        :rtype: Defaults
        """
        return self._defaults

    @defaults.setter
    def defaults(self, defaults: Defaults):
        """Sets the defaults of this FeatureFlag.


        :param defaults: The defaults of this FeatureFlag.
        :type defaults: Defaults
        """

        self._defaults = defaults

    @property
    def description(self) -> str:
        """Gets the description of this FeatureFlag.

        Description of the feature flag.  # noqa: E501

        :return: The description of this FeatureFlag.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this FeatureFlag.

        Description of the feature flag.  # noqa: E501

        :param description: The description of this FeatureFlag.
        :type description: str
        """

        self._description = description

    @property
    def environments(self) -> Dict[str, FeatureFlagConfig]:
        """Gets the environments of this FeatureFlag.


        :return: The environments of this FeatureFlag.
        :rtype: Dict[str, FeatureFlagConfig]
        """
        return self._environments

    @environments.setter
    def environments(self, environments: Dict[str, FeatureFlagConfig]):
        """Sets the environments of this FeatureFlag.


        :param environments: The environments of this FeatureFlag.
        :type environments: Dict[str, FeatureFlagConfig]
        """

        self._environments = environments

    @property
    def goal_ids(self) -> List[str]:
        """Gets the goal_ids of this FeatureFlag.

        An array goals from all environments associated with this feature flag  # noqa: E501

        :return: The goal_ids of this FeatureFlag.
        :rtype: List[str]
        """
        return self._goal_ids

    @goal_ids.setter
    def goal_ids(self, goal_ids: List[str]):
        """Sets the goal_ids of this FeatureFlag.

        An array goals from all environments associated with this feature flag  # noqa: E501

        :param goal_ids: The goal_ids of this FeatureFlag.
        :type goal_ids: List[str]
        """

        self._goal_ids = goal_ids

    @property
    def include_in_snippet(self) -> bool:
        """Gets the include_in_snippet of this FeatureFlag.


        :return: The include_in_snippet of this FeatureFlag.
        :rtype: bool
        """
        return self._include_in_snippet

    @include_in_snippet.setter
    def include_in_snippet(self, include_in_snippet: bool):
        """Sets the include_in_snippet of this FeatureFlag.


        :param include_in_snippet: The include_in_snippet of this FeatureFlag.
        :type include_in_snippet: bool
        """

        self._include_in_snippet = include_in_snippet

    @property
    def key(self) -> str:
        """Gets the key of this FeatureFlag.


        :return: The key of this FeatureFlag.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this FeatureFlag.


        :param key: The key of this FeatureFlag.
        :type key: str
        """

        self._key = key

    @property
    def kind(self) -> str:
        """Gets the kind of this FeatureFlag.

        Whether the feature flag is a boolean flag or multivariate.  # noqa: E501

        :return: The kind of this FeatureFlag.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind: str):
        """Sets the kind of this FeatureFlag.

        Whether the feature flag is a boolean flag or multivariate.  # noqa: E501

        :param kind: The kind of this FeatureFlag.
        :type kind: str
        """

        self._kind = kind

    @property
    def maintainer_id(self) -> str:
        """Gets the maintainer_id of this FeatureFlag.

        The ID of the member that should maintain this flag.  # noqa: E501

        :return: The maintainer_id of this FeatureFlag.
        :rtype: str
        """
        return self._maintainer_id

    @maintainer_id.setter
    def maintainer_id(self, maintainer_id: str):
        """Sets the maintainer_id of this FeatureFlag.

        The ID of the member that should maintain this flag.  # noqa: E501

        :param maintainer_id: The maintainer_id of this FeatureFlag.
        :type maintainer_id: str
        """

        self._maintainer_id = maintainer_id

    @property
    def name(self) -> str:
        """Gets the name of this FeatureFlag.

        Name of the feature flag.  # noqa: E501

        :return: The name of this FeatureFlag.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FeatureFlag.

        Name of the feature flag.  # noqa: E501

        :param name: The name of this FeatureFlag.
        :type name: str
        """

        self._name = name

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this FeatureFlag.

        An array of tags for this feature flag.  # noqa: E501

        :return: The tags of this FeatureFlag.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this FeatureFlag.

        An array of tags for this feature flag.  # noqa: E501

        :param tags: The tags of this FeatureFlag.
        :type tags: List[str]
        """

        self._tags = tags

    @property
    def temporary(self) -> bool:
        """Gets the temporary of this FeatureFlag.

        Whether or not this flag is temporary.  # noqa: E501

        :return: The temporary of this FeatureFlag.
        :rtype: bool
        """
        return self._temporary

    @temporary.setter
    def temporary(self, temporary: bool):
        """Sets the temporary of this FeatureFlag.

        Whether or not this flag is temporary.  # noqa: E501

        :param temporary: The temporary of this FeatureFlag.
        :type temporary: bool
        """

        self._temporary = temporary

    @property
    def variations(self) -> List[Variation]:
        """Gets the variations of this FeatureFlag.

        The variations for this feature flag.  # noqa: E501

        :return: The variations of this FeatureFlag.
        :rtype: List[Variation]
        """
        return self._variations

    @variations.setter
    def variations(self, variations: List[Variation]):
        """Sets the variations of this FeatureFlag.

        The variations for this feature flag.  # noqa: E501

        :param variations: The variations of this FeatureFlag.
        :type variations: List[Variation]
        """

        self._variations = variations
