from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ClientSideAvailability(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, using_environment_id=None, using_mobile_key=None):  # noqa: E501
        """ClientSideAvailability - a model defined in OpenAPI

        :param using_environment_id: The using_environment_id of this ClientSideAvailability.  # noqa: E501
        :type using_environment_id: bool
        :param using_mobile_key: The using_mobile_key of this ClientSideAvailability.  # noqa: E501
        :type using_mobile_key: bool
        """
        self.openapi_types = {
            'using_environment_id': bool,
            'using_mobile_key': bool
        }

        self.attribute_map = {
            'using_environment_id': 'usingEnvironmentId',
            'using_mobile_key': 'usingMobileKey'
        }

        self._using_environment_id = using_environment_id
        self._using_mobile_key = using_mobile_key

    @classmethod
    def from_dict(cls, dikt) -> 'ClientSideAvailability':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ClientSideAvailability of this ClientSideAvailability.  # noqa: E501
        :rtype: ClientSideAvailability
        """
        return util.deserialize_model(dikt, cls)

    @property
    def using_environment_id(self) -> bool:
        """Gets the using_environment_id of this ClientSideAvailability.

        When set to true, this flag will be available to SDKs using the client-side id.  # noqa: E501

        :return: The using_environment_id of this ClientSideAvailability.
        :rtype: bool
        """
        return self._using_environment_id

    @using_environment_id.setter
    def using_environment_id(self, using_environment_id: bool):
        """Sets the using_environment_id of this ClientSideAvailability.

        When set to true, this flag will be available to SDKs using the client-side id.  # noqa: E501

        :param using_environment_id: The using_environment_id of this ClientSideAvailability.
        :type using_environment_id: bool
        """

        self._using_environment_id = using_environment_id

    @property
    def using_mobile_key(self) -> bool:
        """Gets the using_mobile_key of this ClientSideAvailability.

        When set to true, this flag will be available to SDKS using a mobile key.  # noqa: E501

        :return: The using_mobile_key of this ClientSideAvailability.
        :rtype: bool
        """
        return self._using_mobile_key

    @using_mobile_key.setter
    def using_mobile_key(self, using_mobile_key: bool):
        """Sets the using_mobile_key of this ClientSideAvailability.

        When set to true, this flag will be available to SDKS using a mobile key.  # noqa: E501

        :param using_mobile_key: The using_mobile_key of this ClientSideAvailability.
        :type using_mobile_key: bool
        """

        self._using_mobile_key = using_mobile_key
