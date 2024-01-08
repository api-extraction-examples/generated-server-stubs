from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.get_login_profile_response_login_profile import GetLoginProfileResponseLoginProfile
from openapi_server import util

from openapi_server.models.get_login_profile_response_login_profile import GetLoginProfileResponseLoginProfile  # noqa: E501

class GetLoginProfileResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, login_profile=None):  # noqa: E501
        """GetLoginProfileResponse - a model defined in OpenAPI

        :param login_profile: The login_profile of this GetLoginProfileResponse.  # noqa: E501
        :type login_profile: GetLoginProfileResponseLoginProfile
        """
        self.openapi_types = {
            'login_profile': GetLoginProfileResponseLoginProfile
        }

        self.attribute_map = {
            'login_profile': 'LoginProfile'
        }

        self._login_profile = login_profile

    @classmethod
    def from_dict(cls, dikt) -> 'GetLoginProfileResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetLoginProfileResponse of this GetLoginProfileResponse.  # noqa: E501
        :rtype: GetLoginProfileResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def login_profile(self) -> GetLoginProfileResponseLoginProfile:
        """Gets the login_profile of this GetLoginProfileResponse.


        :return: The login_profile of this GetLoginProfileResponse.
        :rtype: GetLoginProfileResponseLoginProfile
        """
        return self._login_profile

    @login_profile.setter
    def login_profile(self, login_profile: GetLoginProfileResponseLoginProfile):
        """Sets the login_profile of this GetLoginProfileResponse.


        :param login_profile: The login_profile of this GetLoginProfileResponse.
        :type login_profile: GetLoginProfileResponseLoginProfile
        """
        if login_profile is None:
            raise ValueError("Invalid value for `login_profile`, must not be `None`")  # noqa: E501

        self._login_profile = login_profile