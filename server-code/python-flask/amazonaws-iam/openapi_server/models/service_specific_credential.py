from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_type import StatusType
from openapi_server import util

from openapi_server.models.status_type import StatusType  # noqa: E501

class ServiceSpecificCredential(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, create_date=None, service_name=None, service_user_name=None, service_password=None, service_specific_credential_id=None, user_name=None, status=None):  # noqa: E501
        """ServiceSpecificCredential - a model defined in OpenAPI

        :param create_date: The create_date of this ServiceSpecificCredential.  # noqa: E501
        :type create_date: datetime
        :param service_name: The service_name of this ServiceSpecificCredential.  # noqa: E501
        :type service_name: str
        :param service_user_name: The service_user_name of this ServiceSpecificCredential.  # noqa: E501
        :type service_user_name: str
        :param service_password: The service_password of this ServiceSpecificCredential.  # noqa: E501
        :type service_password: str
        :param service_specific_credential_id: The service_specific_credential_id of this ServiceSpecificCredential.  # noqa: E501
        :type service_specific_credential_id: str
        :param user_name: The user_name of this ServiceSpecificCredential.  # noqa: E501
        :type user_name: str
        :param status: The status of this ServiceSpecificCredential.  # noqa: E501
        :type status: StatusType
        """
        self.openapi_types = {
            'create_date': datetime,
            'service_name': str,
            'service_user_name': str,
            'service_password': str,
            'service_specific_credential_id': str,
            'user_name': str,
            'status': StatusType
        }

        self.attribute_map = {
            'create_date': 'CreateDate',
            'service_name': 'ServiceName',
            'service_user_name': 'ServiceUserName',
            'service_password': 'ServicePassword',
            'service_specific_credential_id': 'ServiceSpecificCredentialId',
            'user_name': 'UserName',
            'status': 'Status'
        }

        self._create_date = create_date
        self._service_name = service_name
        self._service_user_name = service_user_name
        self._service_password = service_password
        self._service_specific_credential_id = service_specific_credential_id
        self._user_name = user_name
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceSpecificCredential':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceSpecificCredential of this ServiceSpecificCredential.  # noqa: E501
        :rtype: ServiceSpecificCredential
        """
        return util.deserialize_model(dikt, cls)

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this ServiceSpecificCredential.


        :return: The create_date of this ServiceSpecificCredential.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this ServiceSpecificCredential.


        :param create_date: The create_date of this ServiceSpecificCredential.
        :type create_date: datetime
        """
        if create_date is None:
            raise ValueError("Invalid value for `create_date`, must not be `None`")  # noqa: E501

        self._create_date = create_date

    @property
    def service_name(self) -> str:
        """Gets the service_name of this ServiceSpecificCredential.


        :return: The service_name of this ServiceSpecificCredential.
        :rtype: str
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name: str):
        """Sets the service_name of this ServiceSpecificCredential.


        :param service_name: The service_name of this ServiceSpecificCredential.
        :type service_name: str
        """
        if service_name is None:
            raise ValueError("Invalid value for `service_name`, must not be `None`")  # noqa: E501

        self._service_name = service_name

    @property
    def service_user_name(self) -> str:
        """Gets the service_user_name of this ServiceSpecificCredential.


        :return: The service_user_name of this ServiceSpecificCredential.
        :rtype: str
        """
        return self._service_user_name

    @service_user_name.setter
    def service_user_name(self, service_user_name: str):
        """Sets the service_user_name of this ServiceSpecificCredential.


        :param service_user_name: The service_user_name of this ServiceSpecificCredential.
        :type service_user_name: str
        """
        if service_user_name is None:
            raise ValueError("Invalid value for `service_user_name`, must not be `None`")  # noqa: E501

        self._service_user_name = service_user_name

    @property
    def service_password(self) -> str:
        """Gets the service_password of this ServiceSpecificCredential.


        :return: The service_password of this ServiceSpecificCredential.
        :rtype: str
        """
        return self._service_password

    @service_password.setter
    def service_password(self, service_password: str):
        """Sets the service_password of this ServiceSpecificCredential.


        :param service_password: The service_password of this ServiceSpecificCredential.
        :type service_password: str
        """
        if service_password is None:
            raise ValueError("Invalid value for `service_password`, must not be `None`")  # noqa: E501

        self._service_password = service_password

    @property
    def service_specific_credential_id(self) -> str:
        """Gets the service_specific_credential_id of this ServiceSpecificCredential.


        :return: The service_specific_credential_id of this ServiceSpecificCredential.
        :rtype: str
        """
        return self._service_specific_credential_id

    @service_specific_credential_id.setter
    def service_specific_credential_id(self, service_specific_credential_id: str):
        """Sets the service_specific_credential_id of this ServiceSpecificCredential.


        :param service_specific_credential_id: The service_specific_credential_id of this ServiceSpecificCredential.
        :type service_specific_credential_id: str
        """
        if service_specific_credential_id is None:
            raise ValueError("Invalid value for `service_specific_credential_id`, must not be `None`")  # noqa: E501

        self._service_specific_credential_id = service_specific_credential_id

    @property
    def user_name(self) -> str:
        """Gets the user_name of this ServiceSpecificCredential.


        :return: The user_name of this ServiceSpecificCredential.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this ServiceSpecificCredential.


        :param user_name: The user_name of this ServiceSpecificCredential.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def status(self) -> StatusType:
        """Gets the status of this ServiceSpecificCredential.


        :return: The status of this ServiceSpecificCredential.
        :rtype: StatusType
        """
        return self._status

    @status.setter
    def status(self, status: StatusType):
        """Sets the status of this ServiceSpecificCredential.


        :param status: The status of this ServiceSpecificCredential.
        :type status: StatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
