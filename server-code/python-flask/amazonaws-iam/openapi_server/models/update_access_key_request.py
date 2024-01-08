from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_type import StatusType
from openapi_server import util

from openapi_server.models.status_type import StatusType  # noqa: E501

class UpdateAccessKeyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, access_key_id=None, status=None):  # noqa: E501
        """UpdateAccessKeyRequest - a model defined in OpenAPI

        :param user_name: The user_name of this UpdateAccessKeyRequest.  # noqa: E501
        :type user_name: str
        :param access_key_id: The access_key_id of this UpdateAccessKeyRequest.  # noqa: E501
        :type access_key_id: str
        :param status: The status of this UpdateAccessKeyRequest.  # noqa: E501
        :type status: StatusType
        """
        self.openapi_types = {
            'user_name': str,
            'access_key_id': str,
            'status': StatusType
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'access_key_id': 'AccessKeyId',
            'status': 'Status'
        }

        self._user_name = user_name
        self._access_key_id = access_key_id
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateAccessKeyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateAccessKeyRequest of this UpdateAccessKeyRequest.  # noqa: E501
        :rtype: UpdateAccessKeyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this UpdateAccessKeyRequest.


        :return: The user_name of this UpdateAccessKeyRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this UpdateAccessKeyRequest.


        :param user_name: The user_name of this UpdateAccessKeyRequest.
        :type user_name: str
        """

        self._user_name = user_name

    @property
    def access_key_id(self) -> str:
        """Gets the access_key_id of this UpdateAccessKeyRequest.


        :return: The access_key_id of this UpdateAccessKeyRequest.
        :rtype: str
        """
        return self._access_key_id

    @access_key_id.setter
    def access_key_id(self, access_key_id: str):
        """Sets the access_key_id of this UpdateAccessKeyRequest.


        :param access_key_id: The access_key_id of this UpdateAccessKeyRequest.
        :type access_key_id: str
        """
        if access_key_id is None:
            raise ValueError("Invalid value for `access_key_id`, must not be `None`")  # noqa: E501

        self._access_key_id = access_key_id

    @property
    def status(self) -> StatusType:
        """Gets the status of this UpdateAccessKeyRequest.


        :return: The status of this UpdateAccessKeyRequest.
        :rtype: StatusType
        """
        return self._status

    @status.setter
    def status(self, status: StatusType):
        """Sets the status of this UpdateAccessKeyRequest.


        :param status: The status of this UpdateAccessKeyRequest.
        :type status: StatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
