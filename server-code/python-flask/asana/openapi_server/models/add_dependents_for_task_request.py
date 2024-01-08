from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.modify_dependents_request import ModifyDependentsRequest
from openapi_server import util

from openapi_server.models.modify_dependents_request import ModifyDependentsRequest  # noqa: E501

class AddDependentsForTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AddDependentsForTaskRequest - a model defined in OpenAPI

        :param data: The data of this AddDependentsForTaskRequest.  # noqa: E501
        :type data: ModifyDependentsRequest
        """
        self.openapi_types = {
            'data': ModifyDependentsRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AddDependentsForTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The addDependentsForTask_request of this AddDependentsForTaskRequest.  # noqa: E501
        :rtype: AddDependentsForTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ModifyDependentsRequest:
        """Gets the data of this AddDependentsForTaskRequest.


        :return: The data of this AddDependentsForTaskRequest.
        :rtype: ModifyDependentsRequest
        """
        return self._data

    @data.setter
    def data(self, data: ModifyDependentsRequest):
        """Sets the data of this AddDependentsForTaskRequest.


        :param data: The data of this AddDependentsForTaskRequest.
        :type data: ModifyDependentsRequest
        """

        self._data = data