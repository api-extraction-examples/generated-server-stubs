from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateInstanceProfileRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, instance_profile_name=None, path=None, tags=None):  # noqa: E501
        """CreateInstanceProfileRequest - a model defined in OpenAPI

        :param instance_profile_name: The instance_profile_name of this CreateInstanceProfileRequest.  # noqa: E501
        :type instance_profile_name: str
        :param path: The path of this CreateInstanceProfileRequest.  # noqa: E501
        :type path: str
        :param tags: The tags of this CreateInstanceProfileRequest.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'instance_profile_name': str,
            'path': str,
            'tags': List
        }

        self.attribute_map = {
            'instance_profile_name': 'InstanceProfileName',
            'path': 'Path',
            'tags': 'Tags'
        }

        self._instance_profile_name = instance_profile_name
        self._path = path
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'CreateInstanceProfileRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateInstanceProfileRequest of this CreateInstanceProfileRequest.  # noqa: E501
        :rtype: CreateInstanceProfileRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def instance_profile_name(self) -> str:
        """Gets the instance_profile_name of this CreateInstanceProfileRequest.


        :return: The instance_profile_name of this CreateInstanceProfileRequest.
        :rtype: str
        """
        return self._instance_profile_name

    @instance_profile_name.setter
    def instance_profile_name(self, instance_profile_name: str):
        """Sets the instance_profile_name of this CreateInstanceProfileRequest.


        :param instance_profile_name: The instance_profile_name of this CreateInstanceProfileRequest.
        :type instance_profile_name: str
        """
        if instance_profile_name is None:
            raise ValueError("Invalid value for `instance_profile_name`, must not be `None`")  # noqa: E501

        self._instance_profile_name = instance_profile_name

    @property
    def path(self) -> str:
        """Gets the path of this CreateInstanceProfileRequest.


        :return: The path of this CreateInstanceProfileRequest.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this CreateInstanceProfileRequest.


        :param path: The path of this CreateInstanceProfileRequest.
        :type path: str
        """

        self._path = path

    @property
    def tags(self) -> List:
        """Gets the tags of this CreateInstanceProfileRequest.


        :return: The tags of this CreateInstanceProfileRequest.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this CreateInstanceProfileRequest.


        :param tags: The tags of this CreateInstanceProfileRequest.
        :type tags: List
        """

        self._tags = tags
