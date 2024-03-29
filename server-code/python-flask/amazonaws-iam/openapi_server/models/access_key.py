from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_type import StatusType
from openapi_server import util

from openapi_server.models.status_type import StatusType  # noqa: E501

class AccessKey(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, access_key_id=None, status=None, secret_access_key=None, create_date=None):  # noqa: E501
        """AccessKey - a model defined in OpenAPI

        :param user_name: The user_name of this AccessKey.  # noqa: E501
        :type user_name: str
        :param access_key_id: The access_key_id of this AccessKey.  # noqa: E501
        :type access_key_id: str
        :param status: The status of this AccessKey.  # noqa: E501
        :type status: StatusType
        :param secret_access_key: The secret_access_key of this AccessKey.  # noqa: E501
        :type secret_access_key: str
        :param create_date: The create_date of this AccessKey.  # noqa: E501
        :type create_date: datetime
        """
        self.openapi_types = {
            'user_name': str,
            'access_key_id': str,
            'status': StatusType,
            'secret_access_key': str,
            'create_date': datetime
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'access_key_id': 'AccessKeyId',
            'status': 'Status',
            'secret_access_key': 'SecretAccessKey',
            'create_date': 'CreateDate'
        }

        self._user_name = user_name
        self._access_key_id = access_key_id
        self._status = status
        self._secret_access_key = secret_access_key
        self._create_date = create_date

    @classmethod
    def from_dict(cls, dikt) -> 'AccessKey':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AccessKey of this AccessKey.  # noqa: E501
        :rtype: AccessKey
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this AccessKey.


        :return: The user_name of this AccessKey.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this AccessKey.


        :param user_name: The user_name of this AccessKey.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def access_key_id(self) -> str:
        """Gets the access_key_id of this AccessKey.


        :return: The access_key_id of this AccessKey.
        :rtype: str
        """
        return self._access_key_id

    @access_key_id.setter
    def access_key_id(self, access_key_id: str):
        """Sets the access_key_id of this AccessKey.


        :param access_key_id: The access_key_id of this AccessKey.
        :type access_key_id: str
        """
        if access_key_id is None:
            raise ValueError("Invalid value for `access_key_id`, must not be `None`")  # noqa: E501

        self._access_key_id = access_key_id

    @property
    def status(self) -> StatusType:
        """Gets the status of this AccessKey.


        :return: The status of this AccessKey.
        :rtype: StatusType
        """
        return self._status

    @status.setter
    def status(self, status: StatusType):
        """Sets the status of this AccessKey.


        :param status: The status of this AccessKey.
        :type status: StatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def secret_access_key(self) -> str:
        """Gets the secret_access_key of this AccessKey.


        :return: The secret_access_key of this AccessKey.
        :rtype: str
        """
        return self._secret_access_key

    @secret_access_key.setter
    def secret_access_key(self, secret_access_key: str):
        """Sets the secret_access_key of this AccessKey.


        :param secret_access_key: The secret_access_key of this AccessKey.
        :type secret_access_key: str
        """
        if secret_access_key is None:
            raise ValueError("Invalid value for `secret_access_key`, must not be `None`")  # noqa: E501

        self._secret_access_key = secret_access_key

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this AccessKey.


        :return: The create_date of this AccessKey.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this AccessKey.


        :param create_date: The create_date of this AccessKey.
        :type create_date: datetime
        """

        self._create_date = create_date
