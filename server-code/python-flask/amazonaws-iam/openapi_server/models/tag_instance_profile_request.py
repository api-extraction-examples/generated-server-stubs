from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TagInstanceProfileRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, instance_profile_name=None, tags=None):  # noqa: E501
        """TagInstanceProfileRequest - a model defined in OpenAPI

        :param instance_profile_name: The instance_profile_name of this TagInstanceProfileRequest.  # noqa: E501
        :type instance_profile_name: str
        :param tags: The tags of this TagInstanceProfileRequest.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'instance_profile_name': str,
            'tags': List
        }

        self.attribute_map = {
            'instance_profile_name': 'InstanceProfileName',
            'tags': 'Tags'
        }

        self._instance_profile_name = instance_profile_name
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'TagInstanceProfileRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagInstanceProfileRequest of this TagInstanceProfileRequest.  # noqa: E501
        :rtype: TagInstanceProfileRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def instance_profile_name(self) -> str:
        """Gets the instance_profile_name of this TagInstanceProfileRequest.


        :return: The instance_profile_name of this TagInstanceProfileRequest.
        :rtype: str
        """
        return self._instance_profile_name

    @instance_profile_name.setter
    def instance_profile_name(self, instance_profile_name: str):
        """Sets the instance_profile_name of this TagInstanceProfileRequest.


        :param instance_profile_name: The instance_profile_name of this TagInstanceProfileRequest.
        :type instance_profile_name: str
        """
        if instance_profile_name is None:
            raise ValueError("Invalid value for `instance_profile_name`, must not be `None`")  # noqa: E501

        self._instance_profile_name = instance_profile_name

    @property
    def tags(self) -> List:
        """Gets the tags of this TagInstanceProfileRequest.


        :return: The tags of this TagInstanceProfileRequest.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this TagInstanceProfileRequest.


        :param tags: The tags of this TagInstanceProfileRequest.
        :type tags: List
        """
        if tags is None:
            raise ValueError("Invalid value for `tags`, must not be `None`")  # noqa: E501

        self._tags = tags
