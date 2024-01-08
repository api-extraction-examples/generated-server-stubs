from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_type import StatusType
from openapi_server import util

from openapi_server.models.status_type import StatusType  # noqa: E501

class ServiceSpecificCredentialMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, status=None, service_user_name=None, create_date=None, service_specific_credential_id=None, service_name=None):  # noqa: E501
        """ServiceSpecificCredentialMetadata - a model defined in OpenAPI

        :param user_name: The user_name of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type user_name: str
        :param status: The status of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type status: StatusType
        :param service_user_name: The service_user_name of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type service_user_name: str
        :param create_date: The create_date of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type create_date: datetime
        :param service_specific_credential_id: The service_specific_credential_id of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type service_specific_credential_id: str
        :param service_name: The service_name of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :type service_name: str
        """
        self.openapi_types = {
            'user_name': str,
            'status': StatusType,
            'service_user_name': str,
            'create_date': datetime,
            'service_specific_credential_id': str,
            'service_name': str
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'status': 'Status',
            'service_user_name': 'ServiceUserName',
            'create_date': 'CreateDate',
            'service_specific_credential_id': 'ServiceSpecificCredentialId',
            'service_name': 'ServiceName'
        }

        self._user_name = user_name
        self._status = status
        self._service_user_name = service_user_name
        self._create_date = create_date
        self._service_specific_credential_id = service_specific_credential_id
        self._service_name = service_name

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceSpecificCredentialMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceSpecificCredentialMetadata of this ServiceSpecificCredentialMetadata.  # noqa: E501
        :rtype: ServiceSpecificCredentialMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this ServiceSpecificCredentialMetadata.


        :return: The user_name of this ServiceSpecificCredentialMetadata.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this ServiceSpecificCredentialMetadata.


        :param user_name: The user_name of this ServiceSpecificCredentialMetadata.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def status(self) -> StatusType:
        """Gets the status of this ServiceSpecificCredentialMetadata.


        :return: The status of this ServiceSpecificCredentialMetadata.
        :rtype: StatusType
        """
        return self._status

    @status.setter
    def status(self, status: StatusType):
        """Sets the status of this ServiceSpecificCredentialMetadata.


        :param status: The status of this ServiceSpecificCredentialMetadata.
        :type status: StatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def service_user_name(self) -> str:
        """Gets the service_user_name of this ServiceSpecificCredentialMetadata.


        :return: The service_user_name of this ServiceSpecificCredentialMetadata.
        :rtype: str
        """
        return self._service_user_name

    @service_user_name.setter
    def service_user_name(self, service_user_name: str):
        """Sets the service_user_name of this ServiceSpecificCredentialMetadata.


        :param service_user_name: The service_user_name of this ServiceSpecificCredentialMetadata.
        :type service_user_name: str
        """
        if service_user_name is None:
            raise ValueError("Invalid value for `service_user_name`, must not be `None`")  # noqa: E501

        self._service_user_name = service_user_name

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this ServiceSpecificCredentialMetadata.


        :return: The create_date of this ServiceSpecificCredentialMetadata.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this ServiceSpecificCredentialMetadata.


        :param create_date: The create_date of this ServiceSpecificCredentialMetadata.
        :type create_date: datetime
        """
        if create_date is None:
            raise ValueError("Invalid value for `create_date`, must not be `None`")  # noqa: E501

        self._create_date = create_date

    @property
    def service_specific_credential_id(self) -> str:
        """Gets the service_specific_credential_id of this ServiceSpecificCredentialMetadata.


        :return: The service_specific_credential_id of this ServiceSpecificCredentialMetadata.
        :rtype: str
        """
        return self._service_specific_credential_id

    @service_specific_credential_id.setter
    def service_specific_credential_id(self, service_specific_credential_id: str):
        """Sets the service_specific_credential_id of this ServiceSpecificCredentialMetadata.


        :param service_specific_credential_id: The service_specific_credential_id of this ServiceSpecificCredentialMetadata.
        :type service_specific_credential_id: str
        """
        if service_specific_credential_id is None:
            raise ValueError("Invalid value for `service_specific_credential_id`, must not be `None`")  # noqa: E501

        self._service_specific_credential_id = service_specific_credential_id

    @property
    def service_name(self) -> str:
        """Gets the service_name of this ServiceSpecificCredentialMetadata.


        :return: The service_name of this ServiceSpecificCredentialMetadata.
        :rtype: str
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name: str):
        """Sets the service_name of this ServiceSpecificCredentialMetadata.


        :param service_name: The service_name of this ServiceSpecificCredentialMetadata.
        :type service_name: str
        """
        if service_name is None:
            raise ValueError("Invalid value for `service_name`, must not be `None`")  # noqa: E501

        self._service_name = service_name
