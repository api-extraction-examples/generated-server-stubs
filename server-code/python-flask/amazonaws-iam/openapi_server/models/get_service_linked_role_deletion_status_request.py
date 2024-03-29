from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetServiceLinkedRoleDeletionStatusRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, deletion_task_id=None):  # noqa: E501
        """GetServiceLinkedRoleDeletionStatusRequest - a model defined in OpenAPI

        :param deletion_task_id: The deletion_task_id of this GetServiceLinkedRoleDeletionStatusRequest.  # noqa: E501
        :type deletion_task_id: str
        """
        self.openapi_types = {
            'deletion_task_id': str
        }

        self.attribute_map = {
            'deletion_task_id': 'DeletionTaskId'
        }

        self._deletion_task_id = deletion_task_id

    @classmethod
    def from_dict(cls, dikt) -> 'GetServiceLinkedRoleDeletionStatusRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetServiceLinkedRoleDeletionStatusRequest of this GetServiceLinkedRoleDeletionStatusRequest.  # noqa: E501
        :rtype: GetServiceLinkedRoleDeletionStatusRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def deletion_task_id(self) -> str:
        """Gets the deletion_task_id of this GetServiceLinkedRoleDeletionStatusRequest.


        :return: The deletion_task_id of this GetServiceLinkedRoleDeletionStatusRequest.
        :rtype: str
        """
        return self._deletion_task_id

    @deletion_task_id.setter
    def deletion_task_id(self, deletion_task_id: str):
        """Sets the deletion_task_id of this GetServiceLinkedRoleDeletionStatusRequest.


        :param deletion_task_id: The deletion_task_id of this GetServiceLinkedRoleDeletionStatusRequest.
        :type deletion_task_id: str
        """
        if deletion_task_id is None:
            raise ValueError("Invalid value for `deletion_task_id`, must not be `None`")  # noqa: E501

        self._deletion_task_id = deletion_task_id
