from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ResourcesBlkioWeightDeviceInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, weight=None):  # noqa: E501
        """ResourcesBlkioWeightDeviceInner - a model defined in OpenAPI

        :param path: The path of this ResourcesBlkioWeightDeviceInner.  # noqa: E501
        :type path: str
        :param weight: The weight of this ResourcesBlkioWeightDeviceInner.  # noqa: E501
        :type weight: int
        """
        self.openapi_types = {
            'path': str,
            'weight': int
        }

        self.attribute_map = {
            'path': 'Path',
            'weight': 'Weight'
        }

        self._path = path
        self._weight = weight

    @classmethod
    def from_dict(cls, dikt) -> 'ResourcesBlkioWeightDeviceInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Resources_BlkioWeightDevice_inner of this ResourcesBlkioWeightDeviceInner.  # noqa: E501
        :rtype: ResourcesBlkioWeightDeviceInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self) -> str:
        """Gets the path of this ResourcesBlkioWeightDeviceInner.


        :return: The path of this ResourcesBlkioWeightDeviceInner.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this ResourcesBlkioWeightDeviceInner.


        :param path: The path of this ResourcesBlkioWeightDeviceInner.
        :type path: str
        """

        self._path = path

    @property
    def weight(self) -> int:
        """Gets the weight of this ResourcesBlkioWeightDeviceInner.


        :return: The weight of this ResourcesBlkioWeightDeviceInner.
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight: int):
        """Sets the weight of this ResourcesBlkioWeightDeviceInner.


        :param weight: The weight of this ResourcesBlkioWeightDeviceInner.
        :type weight: int
        """
        if weight is not None and weight < 0:  # noqa: E501
            raise ValueError("Invalid value for `weight`, must be a value greater than or equal to `0`")  # noqa: E501

        self._weight = weight
