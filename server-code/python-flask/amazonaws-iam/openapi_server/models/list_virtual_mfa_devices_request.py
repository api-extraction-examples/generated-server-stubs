from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.assignment_status_type import AssignmentStatusType
from openapi_server import util

from openapi_server.models.assignment_status_type import AssignmentStatusType  # noqa: E501

class ListVirtualMFADevicesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assignment_status=None, marker=None, max_items=None):  # noqa: E501
        """ListVirtualMFADevicesRequest - a model defined in OpenAPI

        :param assignment_status: The assignment_status of this ListVirtualMFADevicesRequest.  # noqa: E501
        :type assignment_status: AssignmentStatusType
        :param marker: The marker of this ListVirtualMFADevicesRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListVirtualMFADevicesRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'assignment_status': AssignmentStatusType,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'assignment_status': 'AssignmentStatus',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._assignment_status = assignment_status
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListVirtualMFADevicesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListVirtualMFADevicesRequest of this ListVirtualMFADevicesRequest.  # noqa: E501
        :rtype: ListVirtualMFADevicesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assignment_status(self) -> AssignmentStatusType:
        """Gets the assignment_status of this ListVirtualMFADevicesRequest.


        :return: The assignment_status of this ListVirtualMFADevicesRequest.
        :rtype: AssignmentStatusType
        """
        return self._assignment_status

    @assignment_status.setter
    def assignment_status(self, assignment_status: AssignmentStatusType):
        """Sets the assignment_status of this ListVirtualMFADevicesRequest.


        :param assignment_status: The assignment_status of this ListVirtualMFADevicesRequest.
        :type assignment_status: AssignmentStatusType
        """

        self._assignment_status = assignment_status

    @property
    def marker(self) -> str:
        """Gets the marker of this ListVirtualMFADevicesRequest.


        :return: The marker of this ListVirtualMFADevicesRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListVirtualMFADevicesRequest.


        :param marker: The marker of this ListVirtualMFADevicesRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListVirtualMFADevicesRequest.


        :return: The max_items of this ListVirtualMFADevicesRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListVirtualMFADevicesRequest.


        :param max_items: The max_items of this ListVirtualMFADevicesRequest.
        :type max_items: int
        """

        self._max_items = max_items
