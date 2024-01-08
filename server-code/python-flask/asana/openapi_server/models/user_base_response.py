from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_base_response_all_of_photo import UserBaseResponseAllOfPhoto
from openapi_server import util

from openapi_server.models.user_base_response_all_of_photo import UserBaseResponseAllOfPhoto  # noqa: E501

class UserBaseResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, email=None, photo=None):  # noqa: E501
        """UserBaseResponse - a model defined in OpenAPI

        :param gid: The gid of this UserBaseResponse.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this UserBaseResponse.  # noqa: E501
        :type resource_type: str
        :param name: The name of this UserBaseResponse.  # noqa: E501
        :type name: str
        :param email: The email of this UserBaseResponse.  # noqa: E501
        :type email: str
        :param photo: The photo of this UserBaseResponse.  # noqa: E501
        :type photo: UserBaseResponseAllOfPhoto
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'email': str,
            'photo': UserBaseResponseAllOfPhoto
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'email': 'email',
            'photo': 'photo'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._email = email
        self._photo = photo

    @classmethod
    def from_dict(cls, dikt) -> 'UserBaseResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserBaseResponse of this UserBaseResponse.  # noqa: E501
        :rtype: UserBaseResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this UserBaseResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this UserBaseResponse.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this UserBaseResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this UserBaseResponse.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this UserBaseResponse.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this UserBaseResponse.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this UserBaseResponse.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this UserBaseResponse.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this UserBaseResponse.

        *Read-only except when same user as requester*. The user’s name.  # noqa: E501

        :return: The name of this UserBaseResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UserBaseResponse.

        *Read-only except when same user as requester*. The user’s name.  # noqa: E501

        :param name: The name of this UserBaseResponse.
        :type name: str
        """

        self._name = name

    @property
    def email(self) -> str:
        """Gets the email of this UserBaseResponse.

        The user's email address.  # noqa: E501

        :return: The email of this UserBaseResponse.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this UserBaseResponse.

        The user's email address.  # noqa: E501

        :param email: The email of this UserBaseResponse.
        :type email: str
        """

        self._email = email

    @property
    def photo(self) -> UserBaseResponseAllOfPhoto:
        """Gets the photo of this UserBaseResponse.


        :return: The photo of this UserBaseResponse.
        :rtype: UserBaseResponseAllOfPhoto
        """
        return self._photo

    @photo.setter
    def photo(self, photo: UserBaseResponseAllOfPhoto):
        """Sets the photo of this UserBaseResponse.


        :param photo: The photo of this UserBaseResponse.
        :type photo: UserBaseResponseAllOfPhoto
        """

        self._photo = photo