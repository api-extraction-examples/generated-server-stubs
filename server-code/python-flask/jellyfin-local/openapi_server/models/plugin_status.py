from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PluginStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ACTIVE = 'Active'
    RESTART = 'Restart'
    DELETED = 'Deleted'
    SUPERCEDED = 'Superceded'
    MALFUNCTIONED = 'Malfunctioned'
    NOTSUPPORTED = 'NotSupported'
    DISABLED = 'Disabled'
    def __init__(self):  # noqa: E501
        """PluginStatus - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PluginStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PluginStatus of this PluginStatus.  # noqa: E501
        :rtype: PluginStatus
        """
        return util.deserialize_model(dikt, cls)
