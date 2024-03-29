from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.platform import Platform
from openapi_server import util

from openapi_server.models.platform import Platform  # noqa: E501

class PrereleaseVersionAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, platform=None, version=None):  # noqa: E501
        """PrereleaseVersionAttributes - a model defined in OpenAPI

        :param platform: The platform of this PrereleaseVersionAttributes.  # noqa: E501
        :type platform: Platform
        :param version: The version of this PrereleaseVersionAttributes.  # noqa: E501
        :type version: str
        """
        self.openapi_types = {
            'platform': Platform,
            'version': str
        }

        self.attribute_map = {
            'platform': 'platform',
            'version': 'version'
        }

        self._platform = platform
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'PrereleaseVersionAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PrereleaseVersion_attributes of this PrereleaseVersionAttributes.  # noqa: E501
        :rtype: PrereleaseVersionAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def platform(self) -> Platform:
        """Gets the platform of this PrereleaseVersionAttributes.


        :return: The platform of this PrereleaseVersionAttributes.
        :rtype: Platform
        """
        return self._platform

    @platform.setter
    def platform(self, platform: Platform):
        """Sets the platform of this PrereleaseVersionAttributes.


        :param platform: The platform of this PrereleaseVersionAttributes.
        :type platform: Platform
        """

        self._platform = platform

    @property
    def version(self) -> str:
        """Gets the version of this PrereleaseVersionAttributes.


        :return: The version of this PrereleaseVersionAttributes.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this PrereleaseVersionAttributes.


        :param version: The version of this PrereleaseVersionAttributes.
        :type version: str
        """

        self._version = version
