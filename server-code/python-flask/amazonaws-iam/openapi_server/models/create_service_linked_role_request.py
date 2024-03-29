from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateServiceLinkedRoleRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, aws_service_name=None, description=None, custom_suffix=None):  # noqa: E501
        """CreateServiceLinkedRoleRequest - a model defined in OpenAPI

        :param aws_service_name: The aws_service_name of this CreateServiceLinkedRoleRequest.  # noqa: E501
        :type aws_service_name: str
        :param description: The description of this CreateServiceLinkedRoleRequest.  # noqa: E501
        :type description: str
        :param custom_suffix: The custom_suffix of this CreateServiceLinkedRoleRequest.  # noqa: E501
        :type custom_suffix: str
        """
        self.openapi_types = {
            'aws_service_name': str,
            'description': str,
            'custom_suffix': str
        }

        self.attribute_map = {
            'aws_service_name': 'AWSServiceName',
            'description': 'Description',
            'custom_suffix': 'CustomSuffix'
        }

        self._aws_service_name = aws_service_name
        self._description = description
        self._custom_suffix = custom_suffix

    @classmethod
    def from_dict(cls, dikt) -> 'CreateServiceLinkedRoleRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateServiceLinkedRoleRequest of this CreateServiceLinkedRoleRequest.  # noqa: E501
        :rtype: CreateServiceLinkedRoleRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def aws_service_name(self) -> str:
        """Gets the aws_service_name of this CreateServiceLinkedRoleRequest.


        :return: The aws_service_name of this CreateServiceLinkedRoleRequest.
        :rtype: str
        """
        return self._aws_service_name

    @aws_service_name.setter
    def aws_service_name(self, aws_service_name: str):
        """Sets the aws_service_name of this CreateServiceLinkedRoleRequest.


        :param aws_service_name: The aws_service_name of this CreateServiceLinkedRoleRequest.
        :type aws_service_name: str
        """
        if aws_service_name is None:
            raise ValueError("Invalid value for `aws_service_name`, must not be `None`")  # noqa: E501

        self._aws_service_name = aws_service_name

    @property
    def description(self) -> str:
        """Gets the description of this CreateServiceLinkedRoleRequest.


        :return: The description of this CreateServiceLinkedRoleRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CreateServiceLinkedRoleRequest.


        :param description: The description of this CreateServiceLinkedRoleRequest.
        :type description: str
        """

        self._description = description

    @property
    def custom_suffix(self) -> str:
        """Gets the custom_suffix of this CreateServiceLinkedRoleRequest.


        :return: The custom_suffix of this CreateServiceLinkedRoleRequest.
        :rtype: str
        """
        return self._custom_suffix

    @custom_suffix.setter
    def custom_suffix(self, custom_suffix: str):
        """Sets the custom_suffix of this CreateServiceLinkedRoleRequest.


        :param custom_suffix: The custom_suffix of this CreateServiceLinkedRoleRequest.
        :type custom_suffix: str
        """

        self._custom_suffix = custom_suffix
