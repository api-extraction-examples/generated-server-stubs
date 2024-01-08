from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PutFlagSettingRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, setting=None):  # noqa: E501
        """PutFlagSettingRequest - a model defined in OpenAPI

        :param setting: The setting of this PutFlagSettingRequest.  # noqa: E501
        :type setting: bool
        """
        self.openapi_types = {
            'setting': bool
        }

        self.attribute_map = {
            'setting': 'setting'
        }

        self._setting = setting

    @classmethod
    def from_dict(cls, dikt) -> 'PutFlagSettingRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The putFlagSetting_request of this PutFlagSettingRequest.  # noqa: E501
        :rtype: PutFlagSettingRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def setting(self) -> bool:
        """Gets the setting of this PutFlagSettingRequest.

        The variation value to set for the user. Must match the variation type of the flag.   # noqa: E501

        :return: The setting of this PutFlagSettingRequest.
        :rtype: bool
        """
        return self._setting

    @setting.setter
    def setting(self, setting: bool):
        """Sets the setting of this PutFlagSettingRequest.

        The variation value to set for the user. Must match the variation type of the flag.   # noqa: E501

        :param setting: The setting of this PutFlagSettingRequest.
        :type setting: bool
        """

        self._setting = setting