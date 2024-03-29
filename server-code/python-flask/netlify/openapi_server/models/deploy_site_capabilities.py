from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DeploySiteCapabilities(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, large_media_enabled=None):  # noqa: E501
        """DeploySiteCapabilities - a model defined in OpenAPI

        :param large_media_enabled: The large_media_enabled of this DeploySiteCapabilities.  # noqa: E501
        :type large_media_enabled: bool
        """
        self.openapi_types = {
            'large_media_enabled': bool
        }

        self.attribute_map = {
            'large_media_enabled': 'large_media_enabled'
        }

        self._large_media_enabled = large_media_enabled

    @classmethod
    def from_dict(cls, dikt) -> 'DeploySiteCapabilities':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The deploy_site_capabilities of this DeploySiteCapabilities.  # noqa: E501
        :rtype: DeploySiteCapabilities
        """
        return util.deserialize_model(dikt, cls)

    @property
    def large_media_enabled(self) -> bool:
        """Gets the large_media_enabled of this DeploySiteCapabilities.


        :return: The large_media_enabled of this DeploySiteCapabilities.
        :rtype: bool
        """
        return self._large_media_enabled

    @large_media_enabled.setter
    def large_media_enabled(self, large_media_enabled: bool):
        """Sets the large_media_enabled of this DeploySiteCapabilities.


        :param large_media_enabled: The large_media_enabled of this DeploySiteCapabilities.
        :type large_media_enabled: bool
        """

        self._large_media_enabled = large_media_enabled
