from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.client_side_availability import ClientSideAvailability
from openapi_server.models.defaults import Defaults
from openapi_server.models.variation import Variation
from openapi_server import util

from openapi_server.models.client_side_availability import ClientSideAvailability  # noqa: E501
from openapi_server.models.defaults import Defaults  # noqa: E501
from openapi_server.models.variation import Variation  # noqa: E501

class PostFeatureFlagRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client_side_availability=None, defaults=None, description=None, include_in_snippet=None, key=None, name=None, tags=None, temporary=None, variations=None):  # noqa: E501
        """PostFeatureFlagRequest - a model defined in OpenAPI

        :param client_side_availability: The client_side_availability of this PostFeatureFlagRequest.  # noqa: E501
        :type client_side_availability: ClientSideAvailability
        :param defaults: The defaults of this PostFeatureFlagRequest.  # noqa: E501
        :type defaults: Defaults
        :param description: The description of this PostFeatureFlagRequest.  # noqa: E501
        :type description: str
        :param include_in_snippet: The include_in_snippet of this PostFeatureFlagRequest.  # noqa: E501
        :type include_in_snippet: bool
        :param key: The key of this PostFeatureFlagRequest.  # noqa: E501
        :type key: str
        :param name: The name of this PostFeatureFlagRequest.  # noqa: E501
        :type name: str
        :param tags: The tags of this PostFeatureFlagRequest.  # noqa: E501
        :type tags: List[str]
        :param temporary: The temporary of this PostFeatureFlagRequest.  # noqa: E501
        :type temporary: bool
        :param variations: The variations of this PostFeatureFlagRequest.  # noqa: E501
        :type variations: List[Variation]
        """
        self.openapi_types = {
            'client_side_availability': ClientSideAvailability,
            'defaults': Defaults,
            'description': str,
            'include_in_snippet': bool,
            'key': str,
            'name': str,
            'tags': List[str],
            'temporary': bool,
            'variations': List[Variation]
        }

        self.attribute_map = {
            'client_side_availability': 'clientSideAvailability',
            'defaults': 'defaults',
            'description': 'description',
            'include_in_snippet': 'includeInSnippet',
            'key': 'key',
            'name': 'name',
            'tags': 'tags',
            'temporary': 'temporary',
            'variations': 'variations'
        }

        self._client_side_availability = client_side_availability
        self._defaults = defaults
        self._description = description
        self._include_in_snippet = include_in_snippet
        self._key = key
        self._name = name
        self._tags = tags
        self._temporary = temporary
        self._variations = variations

    @classmethod
    def from_dict(cls, dikt) -> 'PostFeatureFlagRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postFeatureFlag_request of this PostFeatureFlagRequest.  # noqa: E501
        :rtype: PostFeatureFlagRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client_side_availability(self) -> ClientSideAvailability:
        """Gets the client_side_availability of this PostFeatureFlagRequest.


        :return: The client_side_availability of this PostFeatureFlagRequest.
        :rtype: ClientSideAvailability
        """
        return self._client_side_availability

    @client_side_availability.setter
    def client_side_availability(self, client_side_availability: ClientSideAvailability):
        """Sets the client_side_availability of this PostFeatureFlagRequest.


        :param client_side_availability: The client_side_availability of this PostFeatureFlagRequest.
        :type client_side_availability: ClientSideAvailability
        """

        self._client_side_availability = client_side_availability

    @property
    def defaults(self) -> Defaults:
        """Gets the defaults of this PostFeatureFlagRequest.


        :return: The defaults of this PostFeatureFlagRequest.
        :rtype: Defaults
        """
        return self._defaults

    @defaults.setter
    def defaults(self, defaults: Defaults):
        """Sets the defaults of this PostFeatureFlagRequest.


        :param defaults: The defaults of this PostFeatureFlagRequest.
        :type defaults: Defaults
        """

        self._defaults = defaults

    @property
    def description(self) -> str:
        """Gets the description of this PostFeatureFlagRequest.

        A description of the feature flag.  # noqa: E501

        :return: The description of this PostFeatureFlagRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this PostFeatureFlagRequest.

        A description of the feature flag.  # noqa: E501

        :param description: The description of this PostFeatureFlagRequest.
        :type description: str
        """

        self._description = description

    @property
    def include_in_snippet(self) -> bool:
        """Gets the include_in_snippet of this PostFeatureFlagRequest.

        Whether or not this flag should be made available to the client-side JavaScript SDK.  # noqa: E501

        :return: The include_in_snippet of this PostFeatureFlagRequest.
        :rtype: bool
        """
        return self._include_in_snippet

    @include_in_snippet.setter
    def include_in_snippet(self, include_in_snippet: bool):
        """Sets the include_in_snippet of this PostFeatureFlagRequest.

        Whether or not this flag should be made available to the client-side JavaScript SDK.  # noqa: E501

        :param include_in_snippet: The include_in_snippet of this PostFeatureFlagRequest.
        :type include_in_snippet: bool
        """

        self._include_in_snippet = include_in_snippet

    @property
    def key(self) -> str:
        """Gets the key of this PostFeatureFlagRequest.

        A unique key that will be used to reference the flag in your code.  # noqa: E501

        :return: The key of this PostFeatureFlagRequest.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this PostFeatureFlagRequest.

        A unique key that will be used to reference the flag in your code.  # noqa: E501

        :param key: The key of this PostFeatureFlagRequest.
        :type key: str
        """
        if key is None:
            raise ValueError("Invalid value for `key`, must not be `None`")  # noqa: E501

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this PostFeatureFlagRequest.

        A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.  # noqa: E501

        :return: The name of this PostFeatureFlagRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PostFeatureFlagRequest.

        A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.  # noqa: E501

        :param name: The name of this PostFeatureFlagRequest.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this PostFeatureFlagRequest.

        Tags for the feature flag.  # noqa: E501

        :return: The tags of this PostFeatureFlagRequest.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this PostFeatureFlagRequest.

        Tags for the feature flag.  # noqa: E501

        :param tags: The tags of this PostFeatureFlagRequest.
        :type tags: List[str]
        """

        self._tags = tags

    @property
    def temporary(self) -> bool:
        """Gets the temporary of this PostFeatureFlagRequest.

        Whether or not the flag is a temporary flag.  # noqa: E501

        :return: The temporary of this PostFeatureFlagRequest.
        :rtype: bool
        """
        return self._temporary

    @temporary.setter
    def temporary(self, temporary: bool):
        """Sets the temporary of this PostFeatureFlagRequest.

        Whether or not the flag is a temporary flag.  # noqa: E501

        :param temporary: The temporary of this PostFeatureFlagRequest.
        :type temporary: bool
        """

        self._temporary = temporary

    @property
    def variations(self) -> List[Variation]:
        """Gets the variations of this PostFeatureFlagRequest.

        An array of possible variations for the flag.  # noqa: E501

        :return: The variations of this PostFeatureFlagRequest.
        :rtype: List[Variation]
        """
        return self._variations

    @variations.setter
    def variations(self, variations: List[Variation]):
        """Sets the variations of this PostFeatureFlagRequest.

        An array of possible variations for the flag.  # noqa: E501

        :param variations: The variations of this PostFeatureFlagRequest.
        :type variations: List[Variation]
        """
        if variations is None:
            raise ValueError("Invalid value for `variations`, must not be `None`")  # noqa: E501

        self._variations = variations