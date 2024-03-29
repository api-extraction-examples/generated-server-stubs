from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ImageRootFS(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, base_layer=None, layers=None, type=None):  # noqa: E501
        """ImageRootFS - a model defined in OpenAPI

        :param base_layer: The base_layer of this ImageRootFS.  # noqa: E501
        :type base_layer: str
        :param layers: The layers of this ImageRootFS.  # noqa: E501
        :type layers: List[str]
        :param type: The type of this ImageRootFS.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'base_layer': str,
            'layers': List[str],
            'type': str
        }

        self.attribute_map = {
            'base_layer': 'BaseLayer',
            'layers': 'Layers',
            'type': 'Type'
        }

        self._base_layer = base_layer
        self._layers = layers
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'ImageRootFS':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Image_RootFS of this ImageRootFS.  # noqa: E501
        :rtype: ImageRootFS
        """
        return util.deserialize_model(dikt, cls)

    @property
    def base_layer(self) -> str:
        """Gets the base_layer of this ImageRootFS.


        :return: The base_layer of this ImageRootFS.
        :rtype: str
        """
        return self._base_layer

    @base_layer.setter
    def base_layer(self, base_layer: str):
        """Sets the base_layer of this ImageRootFS.


        :param base_layer: The base_layer of this ImageRootFS.
        :type base_layer: str
        """

        self._base_layer = base_layer

    @property
    def layers(self) -> List[str]:
        """Gets the layers of this ImageRootFS.


        :return: The layers of this ImageRootFS.
        :rtype: List[str]
        """
        return self._layers

    @layers.setter
    def layers(self, layers: List[str]):
        """Sets the layers of this ImageRootFS.


        :param layers: The layers of this ImageRootFS.
        :type layers: List[str]
        """

        self._layers = layers

    @property
    def type(self) -> str:
        """Gets the type of this ImageRootFS.


        :return: The type of this ImageRootFS.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ImageRootFS.


        :param type: The type of this ImageRootFS.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
