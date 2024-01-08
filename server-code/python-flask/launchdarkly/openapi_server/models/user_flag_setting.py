from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.links import Links  # noqa: E501

class UserFlagSetting(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, value=None, setting=None):  # noqa: E501
        """UserFlagSetting - a model defined in OpenAPI

        :param links: The links of this UserFlagSetting.  # noqa: E501
        :type links: Links
        :param value: The value of this UserFlagSetting.  # noqa: E501
        :type value: bool
        :param setting: The setting of this UserFlagSetting.  # noqa: E501
        :type setting: bool
        """
        self.openapi_types = {
            'links': Links,
            'value': bool,
            'setting': bool
        }

        self.attribute_map = {
            'links': '_links',
            'value': '_value',
            'setting': 'setting'
        }

        self._links = links
        self._value = value
        self._setting = setting

    @classmethod
    def from_dict(cls, dikt) -> 'UserFlagSetting':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserFlagSetting of this UserFlagSetting.  # noqa: E501
        :rtype: UserFlagSetting
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this UserFlagSetting.


        :return: The links of this UserFlagSetting.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this UserFlagSetting.


        :param links: The links of this UserFlagSetting.
        :type links: Links
        """

        self._links = links

    @property
    def value(self) -> bool:
        """Gets the value of this UserFlagSetting.

        The most important attribute in the response. The _value is the current setting for the user. For a boolean feature toggle, this will be true, false, or null if there is no defined fallthrough value.  # noqa: E501

        :return: The value of this UserFlagSetting.
        :rtype: bool
        """
        return self._value

    @value.setter
    def value(self, value: bool):
        """Sets the value of this UserFlagSetting.

        The most important attribute in the response. The _value is the current setting for the user. For a boolean feature toggle, this will be true, false, or null if there is no defined fallthrough value.  # noqa: E501

        :param value: The value of this UserFlagSetting.
        :type value: bool
        """

        self._value = value

    @property
    def setting(self) -> bool:
        """Gets the setting of this UserFlagSetting.

        The setting attribute indicates whether you've explicitly targeted this user to receive a particular variation. For example, if you have explicitly turned off a feature toggle for a user, setting will be false. A setting of null means that you haven't assigned that user to a specific variation.  # noqa: E501

        :return: The setting of this UserFlagSetting.
        :rtype: bool
        """
        return self._setting

    @setting.setter
    def setting(self, setting: bool):
        """Sets the setting of this UserFlagSetting.

        The setting attribute indicates whether you've explicitly targeted this user to receive a particular variation. For example, if you have explicitly turned off a feature toggle for a user, setting will be false. A setting of null means that you haven't assigned that user to a specific variation.  # noqa: E501

        :param setting: The setting of this UserFlagSetting.
        :type setting: bool
        """

        self._setting = setting
