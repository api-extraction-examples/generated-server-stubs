from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StatusMapping(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, issue_type_id=None, new_status_id=None, status_id=None):  # noqa: E501
        """StatusMapping - a model defined in OpenAPI

        :param issue_type_id: The issue_type_id of this StatusMapping.  # noqa: E501
        :type issue_type_id: str
        :param new_status_id: The new_status_id of this StatusMapping.  # noqa: E501
        :type new_status_id: str
        :param status_id: The status_id of this StatusMapping.  # noqa: E501
        :type status_id: str
        """
        self.openapi_types = {
            'issue_type_id': str,
            'new_status_id': str,
            'status_id': str
        }

        self.attribute_map = {
            'issue_type_id': 'issueTypeId',
            'new_status_id': 'newStatusId',
            'status_id': 'statusId'
        }

        self._issue_type_id = issue_type_id
        self._new_status_id = new_status_id
        self._status_id = status_id

    @classmethod
    def from_dict(cls, dikt) -> 'StatusMapping':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StatusMapping of this StatusMapping.  # noqa: E501
        :rtype: StatusMapping
        """
        return util.deserialize_model(dikt, cls)

    @property
    def issue_type_id(self) -> str:
        """Gets the issue_type_id of this StatusMapping.

        The ID of the issue type.  # noqa: E501

        :return: The issue_type_id of this StatusMapping.
        :rtype: str
        """
        return self._issue_type_id

    @issue_type_id.setter
    def issue_type_id(self, issue_type_id: str):
        """Sets the issue_type_id of this StatusMapping.

        The ID of the issue type.  # noqa: E501

        :param issue_type_id: The issue_type_id of this StatusMapping.
        :type issue_type_id: str
        """
        if issue_type_id is None:
            raise ValueError("Invalid value for `issue_type_id`, must not be `None`")  # noqa: E501

        self._issue_type_id = issue_type_id

    @property
    def new_status_id(self) -> str:
        """Gets the new_status_id of this StatusMapping.

        The ID of the new status.  # noqa: E501

        :return: The new_status_id of this StatusMapping.
        :rtype: str
        """
        return self._new_status_id

    @new_status_id.setter
    def new_status_id(self, new_status_id: str):
        """Sets the new_status_id of this StatusMapping.

        The ID of the new status.  # noqa: E501

        :param new_status_id: The new_status_id of this StatusMapping.
        :type new_status_id: str
        """
        if new_status_id is None:
            raise ValueError("Invalid value for `new_status_id`, must not be `None`")  # noqa: E501

        self._new_status_id = new_status_id

    @property
    def status_id(self) -> str:
        """Gets the status_id of this StatusMapping.

        The ID of the status.  # noqa: E501

        :return: The status_id of this StatusMapping.
        :rtype: str
        """
        return self._status_id

    @status_id.setter
    def status_id(self, status_id: str):
        """Sets the status_id of this StatusMapping.

        The ID of the status.  # noqa: E501

        :param status_id: The status_id of this StatusMapping.
        :type status_id: str
        """
        if status_id is None:
            raise ValueError("Invalid value for `status_id`, must not be `None`")  # noqa: E501

        self._status_id = status_id