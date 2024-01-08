from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.error_collection import ErrorCollection
from openapi_server import util

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501

class BulkOperationErrorResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, element_errors=None, failed_element_number=None, status=None):  # noqa: E501
        """BulkOperationErrorResult - a model defined in OpenAPI

        :param element_errors: The element_errors of this BulkOperationErrorResult.  # noqa: E501
        :type element_errors: ErrorCollection
        :param failed_element_number: The failed_element_number of this BulkOperationErrorResult.  # noqa: E501
        :type failed_element_number: int
        :param status: The status of this BulkOperationErrorResult.  # noqa: E501
        :type status: int
        """
        self.openapi_types = {
            'element_errors': ErrorCollection,
            'failed_element_number': int,
            'status': int
        }

        self.attribute_map = {
            'element_errors': 'elementErrors',
            'failed_element_number': 'failedElementNumber',
            'status': 'status'
        }

        self._element_errors = element_errors
        self._failed_element_number = failed_element_number
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'BulkOperationErrorResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BulkOperationErrorResult of this BulkOperationErrorResult.  # noqa: E501
        :rtype: BulkOperationErrorResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def element_errors(self) -> ErrorCollection:
        """Gets the element_errors of this BulkOperationErrorResult.


        :return: The element_errors of this BulkOperationErrorResult.
        :rtype: ErrorCollection
        """
        return self._element_errors

    @element_errors.setter
    def element_errors(self, element_errors: ErrorCollection):
        """Sets the element_errors of this BulkOperationErrorResult.


        :param element_errors: The element_errors of this BulkOperationErrorResult.
        :type element_errors: ErrorCollection
        """

        self._element_errors = element_errors

    @property
    def failed_element_number(self) -> int:
        """Gets the failed_element_number of this BulkOperationErrorResult.


        :return: The failed_element_number of this BulkOperationErrorResult.
        :rtype: int
        """
        return self._failed_element_number

    @failed_element_number.setter
    def failed_element_number(self, failed_element_number: int):
        """Sets the failed_element_number of this BulkOperationErrorResult.


        :param failed_element_number: The failed_element_number of this BulkOperationErrorResult.
        :type failed_element_number: int
        """

        self._failed_element_number = failed_element_number

    @property
    def status(self) -> int:
        """Gets the status of this BulkOperationErrorResult.


        :return: The status of this BulkOperationErrorResult.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """Sets the status of this BulkOperationErrorResult.


        :param status: The status of this BulkOperationErrorResult.
        :type status: int
        """

        self._status = status
