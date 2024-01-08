from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.http_header_info import HttpHeaderInfo
from openapi_server import util

from openapi_server.models.http_header_info import HttpHeaderInfo  # noqa: E501

class DeviceIdentification(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, friendly_name=None, headers=None, manufacturer=None, manufacturer_url=None, model_description=None, model_name=None, model_number=None, model_url=None, serial_number=None):  # noqa: E501
        """DeviceIdentification - a model defined in OpenAPI

        :param friendly_name: The friendly_name of this DeviceIdentification.  # noqa: E501
        :type friendly_name: str
        :param headers: The headers of this DeviceIdentification.  # noqa: E501
        :type headers: List[HttpHeaderInfo]
        :param manufacturer: The manufacturer of this DeviceIdentification.  # noqa: E501
        :type manufacturer: str
        :param manufacturer_url: The manufacturer_url of this DeviceIdentification.  # noqa: E501
        :type manufacturer_url: str
        :param model_description: The model_description of this DeviceIdentification.  # noqa: E501
        :type model_description: str
        :param model_name: The model_name of this DeviceIdentification.  # noqa: E501
        :type model_name: str
        :param model_number: The model_number of this DeviceIdentification.  # noqa: E501
        :type model_number: str
        :param model_url: The model_url of this DeviceIdentification.  # noqa: E501
        :type model_url: str
        :param serial_number: The serial_number of this DeviceIdentification.  # noqa: E501
        :type serial_number: str
        """
        self.openapi_types = {
            'friendly_name': str,
            'headers': List[HttpHeaderInfo],
            'manufacturer': str,
            'manufacturer_url': str,
            'model_description': str,
            'model_name': str,
            'model_number': str,
            'model_url': str,
            'serial_number': str
        }

        self.attribute_map = {
            'friendly_name': 'FriendlyName',
            'headers': 'Headers',
            'manufacturer': 'Manufacturer',
            'manufacturer_url': 'ManufacturerUrl',
            'model_description': 'ModelDescription',
            'model_name': 'ModelName',
            'model_number': 'ModelNumber',
            'model_url': 'ModelUrl',
            'serial_number': 'SerialNumber'
        }

        self._friendly_name = friendly_name
        self._headers = headers
        self._manufacturer = manufacturer
        self._manufacturer_url = manufacturer_url
        self._model_description = model_description
        self._model_name = model_name
        self._model_number = model_number
        self._model_url = model_url
        self._serial_number = serial_number

    @classmethod
    def from_dict(cls, dikt) -> 'DeviceIdentification':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeviceIdentification of this DeviceIdentification.  # noqa: E501
        :rtype: DeviceIdentification
        """
        return util.deserialize_model(dikt, cls)

    @property
    def friendly_name(self) -> str:
        """Gets the friendly_name of this DeviceIdentification.

        Gets or sets the name of the friendly.  # noqa: E501

        :return: The friendly_name of this DeviceIdentification.
        :rtype: str
        """
        return self._friendly_name

    @friendly_name.setter
    def friendly_name(self, friendly_name: str):
        """Sets the friendly_name of this DeviceIdentification.

        Gets or sets the name of the friendly.  # noqa: E501

        :param friendly_name: The friendly_name of this DeviceIdentification.
        :type friendly_name: str
        """

        self._friendly_name = friendly_name

    @property
    def headers(self) -> List[HttpHeaderInfo]:
        """Gets the headers of this DeviceIdentification.

        Gets or sets the headers.  # noqa: E501

        :return: The headers of this DeviceIdentification.
        :rtype: List[HttpHeaderInfo]
        """
        return self._headers

    @headers.setter
    def headers(self, headers: List[HttpHeaderInfo]):
        """Sets the headers of this DeviceIdentification.

        Gets or sets the headers.  # noqa: E501

        :param headers: The headers of this DeviceIdentification.
        :type headers: List[HttpHeaderInfo]
        """

        self._headers = headers

    @property
    def manufacturer(self) -> str:
        """Gets the manufacturer of this DeviceIdentification.

        Gets or sets the manufacturer.  # noqa: E501

        :return: The manufacturer of this DeviceIdentification.
        :rtype: str
        """
        return self._manufacturer

    @manufacturer.setter
    def manufacturer(self, manufacturer: str):
        """Sets the manufacturer of this DeviceIdentification.

        Gets or sets the manufacturer.  # noqa: E501

        :param manufacturer: The manufacturer of this DeviceIdentification.
        :type manufacturer: str
        """

        self._manufacturer = manufacturer

    @property
    def manufacturer_url(self) -> str:
        """Gets the manufacturer_url of this DeviceIdentification.

        Gets or sets the manufacturer URL.  # noqa: E501

        :return: The manufacturer_url of this DeviceIdentification.
        :rtype: str
        """
        return self._manufacturer_url

    @manufacturer_url.setter
    def manufacturer_url(self, manufacturer_url: str):
        """Sets the manufacturer_url of this DeviceIdentification.

        Gets or sets the manufacturer URL.  # noqa: E501

        :param manufacturer_url: The manufacturer_url of this DeviceIdentification.
        :type manufacturer_url: str
        """

        self._manufacturer_url = manufacturer_url

    @property
    def model_description(self) -> str:
        """Gets the model_description of this DeviceIdentification.

        Gets or sets the model description.  # noqa: E501

        :return: The model_description of this DeviceIdentification.
        :rtype: str
        """
        return self._model_description

    @model_description.setter
    def model_description(self, model_description: str):
        """Sets the model_description of this DeviceIdentification.

        Gets or sets the model description.  # noqa: E501

        :param model_description: The model_description of this DeviceIdentification.
        :type model_description: str
        """

        self._model_description = model_description

    @property
    def model_name(self) -> str:
        """Gets the model_name of this DeviceIdentification.

        Gets or sets the name of the model.  # noqa: E501

        :return: The model_name of this DeviceIdentification.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name: str):
        """Sets the model_name of this DeviceIdentification.

        Gets or sets the name of the model.  # noqa: E501

        :param model_name: The model_name of this DeviceIdentification.
        :type model_name: str
        """

        self._model_name = model_name

    @property
    def model_number(self) -> str:
        """Gets the model_number of this DeviceIdentification.

        Gets or sets the model number.  # noqa: E501

        :return: The model_number of this DeviceIdentification.
        :rtype: str
        """
        return self._model_number

    @model_number.setter
    def model_number(self, model_number: str):
        """Sets the model_number of this DeviceIdentification.

        Gets or sets the model number.  # noqa: E501

        :param model_number: The model_number of this DeviceIdentification.
        :type model_number: str
        """

        self._model_number = model_number

    @property
    def model_url(self) -> str:
        """Gets the model_url of this DeviceIdentification.

        Gets or sets the model URL.  # noqa: E501

        :return: The model_url of this DeviceIdentification.
        :rtype: str
        """
        return self._model_url

    @model_url.setter
    def model_url(self, model_url: str):
        """Sets the model_url of this DeviceIdentification.

        Gets or sets the model URL.  # noqa: E501

        :param model_url: The model_url of this DeviceIdentification.
        :type model_url: str
        """

        self._model_url = model_url

    @property
    def serial_number(self) -> str:
        """Gets the serial_number of this DeviceIdentification.

        Gets or sets the serial number.  # noqa: E501

        :return: The serial_number of this DeviceIdentification.
        :rtype: str
        """
        return self._serial_number

    @serial_number.setter
    def serial_number(self, serial_number: str):
        """Sets the serial_number of this DeviceIdentification.

        Gets or sets the serial number.  # noqa: E501

        :param serial_number: The serial_number of this DeviceIdentification.
        :type serial_number: str
        """

        self._serial_number = serial_number
