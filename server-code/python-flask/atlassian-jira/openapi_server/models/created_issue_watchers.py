from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.error_collection import ErrorCollection
from openapi_server.models.warning_collection import WarningCollection
from openapi_server import util

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.warning_collection import WarningCollection  # noqa: E501

class CreatedIssueWatchers(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, error_collection=None, status=None, warning_collection=None):  # noqa: E501
        """CreatedIssueWatchers - a model defined in OpenAPI

        :param error_collection: The error_collection of this CreatedIssueWatchers.  # noqa: E501
        :type error_collection: ErrorCollection
        :param status: The status of this CreatedIssueWatchers.  # noqa: E501
        :type status: int
        :param warning_collection: The warning_collection of this CreatedIssueWatchers.  # noqa: E501
        :type warning_collection: WarningCollection
        """
        self.openapi_types = {
            'error_collection': ErrorCollection,
            'status': int,
            'warning_collection': WarningCollection
        }

        self.attribute_map = {
            'error_collection': 'errorCollection',
            'status': 'status',
            'warning_collection': 'warningCollection'
        }

        self._error_collection = error_collection
        self._status = status
        self._warning_collection = warning_collection

    @classmethod
    def from_dict(cls, dikt) -> 'CreatedIssueWatchers':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreatedIssue_watchers of this CreatedIssueWatchers.  # noqa: E501
        :rtype: CreatedIssueWatchers
        """
        return util.deserialize_model(dikt, cls)

    @property
    def error_collection(self) -> ErrorCollection:
        """Gets the error_collection of this CreatedIssueWatchers.


        :return: The error_collection of this CreatedIssueWatchers.
        :rtype: ErrorCollection
        """
        return self._error_collection

    @error_collection.setter
    def error_collection(self, error_collection: ErrorCollection):
        """Sets the error_collection of this CreatedIssueWatchers.


        :param error_collection: The error_collection of this CreatedIssueWatchers.
        :type error_collection: ErrorCollection
        """

        self._error_collection = error_collection

    @property
    def status(self) -> int:
        """Gets the status of this CreatedIssueWatchers.


        :return: The status of this CreatedIssueWatchers.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """Sets the status of this CreatedIssueWatchers.


        :param status: The status of this CreatedIssueWatchers.
        :type status: int
        """

        self._status = status

    @property
    def warning_collection(self) -> WarningCollection:
        """Gets the warning_collection of this CreatedIssueWatchers.


        :return: The warning_collection of this CreatedIssueWatchers.
        :rtype: WarningCollection
        """
        return self._warning_collection

    @warning_collection.setter
    def warning_collection(self, warning_collection: WarningCollection):
        """Sets the warning_collection of this CreatedIssueWatchers.


        :param warning_collection: The warning_collection of this CreatedIssueWatchers.
        :type warning_collection: WarningCollection
        """

        self._warning_collection = warning_collection
