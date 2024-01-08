from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.batch_request_action_options import BatchRequestActionOptions
from openapi_server import util

from openapi_server.models.batch_request_action_options import BatchRequestActionOptions  # noqa: E501

class BatchRequestAction(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, method=None, options=None, relative_path=None):  # noqa: E501
        """BatchRequestAction - a model defined in OpenAPI

        :param data: The data of this BatchRequestAction.  # noqa: E501
        :type data: object
        :param method: The method of this BatchRequestAction.  # noqa: E501
        :type method: str
        :param options: The options of this BatchRequestAction.  # noqa: E501
        :type options: BatchRequestActionOptions
        :param relative_path: The relative_path of this BatchRequestAction.  # noqa: E501
        :type relative_path: str
        """
        self.openapi_types = {
            'data': object,
            'method': str,
            'options': BatchRequestActionOptions,
            'relative_path': str
        }

        self.attribute_map = {
            'data': 'data',
            'method': 'method',
            'options': 'options',
            'relative_path': 'relative_path'
        }

        self._data = data
        self._method = method
        self._options = options
        self._relative_path = relative_path

    @classmethod
    def from_dict(cls, dikt) -> 'BatchRequestAction':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BatchRequestAction of this BatchRequestAction.  # noqa: E501
        :rtype: BatchRequestAction
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> object:
        """Gets the data of this BatchRequestAction.

        For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.  # noqa: E501

        :return: The data of this BatchRequestAction.
        :rtype: object
        """
        return self._data

    @data.setter
    def data(self, data: object):
        """Sets the data of this BatchRequestAction.

        For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.  # noqa: E501

        :param data: The data of this BatchRequestAction.
        :type data: object
        """

        self._data = data

    @property
    def method(self) -> str:
        """Gets the method of this BatchRequestAction.

        The HTTP method you wish to emulate for the action.  # noqa: E501

        :return: The method of this BatchRequestAction.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method: str):
        """Sets the method of this BatchRequestAction.

        The HTTP method you wish to emulate for the action.  # noqa: E501

        :param method: The method of this BatchRequestAction.
        :type method: str
        """
        allowed_values = ["get", "post", "put", "delete", "patch", "head"]  # noqa: E501
        if method not in allowed_values:
            raise ValueError(
                "Invalid value for `method` ({0}), must be one of {1}"
                .format(method, allowed_values)
            )

        self._method = method

    @property
    def options(self) -> BatchRequestActionOptions:
        """Gets the options of this BatchRequestAction.


        :return: The options of this BatchRequestAction.
        :rtype: BatchRequestActionOptions
        """
        return self._options

    @options.setter
    def options(self, options: BatchRequestActionOptions):
        """Sets the options of this BatchRequestAction.


        :param options: The options of this BatchRequestAction.
        :type options: BatchRequestActionOptions
        """

        self._options = options

    @property
    def relative_path(self) -> str:
        """Gets the relative_path of this BatchRequestAction.

        The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.  # noqa: E501

        :return: The relative_path of this BatchRequestAction.
        :rtype: str
        """
        return self._relative_path

    @relative_path.setter
    def relative_path(self, relative_path: str):
        """Sets the relative_path of this BatchRequestAction.

        The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.  # noqa: E501

        :param relative_path: The relative_path of this BatchRequestAction.
        :type relative_path: str
        """
        if relative_path is None:
            raise ValueError("Invalid value for `relative_path`, must not be `None`")  # noqa: E501

        self._relative_path = relative_path
