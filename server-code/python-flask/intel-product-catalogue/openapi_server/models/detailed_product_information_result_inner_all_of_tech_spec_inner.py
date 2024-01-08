from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DetailedProductInformationResultInnerAllOfTechSpecInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, disclaimer=None, highlight_key=None, label=None, raw_value=None, tool_tip=None, value=None):  # noqa: E501
        """DetailedProductInformationResultInnerAllOfTechSpecInner - a model defined in OpenAPI

        :param disclaimer: The disclaimer of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type disclaimer: str
        :param highlight_key: The highlight_key of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type highlight_key: str
        :param label: The label of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type label: str
        :param raw_value: The raw_value of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type raw_value: str
        :param tool_tip: The tool_tip of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type tool_tip: str
        :param value: The value of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'disclaimer': str,
            'highlight_key': str,
            'label': str,
            'raw_value': str,
            'tool_tip': str,
            'value': str
        }

        self.attribute_map = {
            'disclaimer': 'disclaimer',
            'highlight_key': 'highlight_key',
            'label': 'label',
            'raw_value': 'raw_value',
            'tool_tip': 'tool_tip',
            'value': 'value'
        }

        self._disclaimer = disclaimer
        self._highlight_key = highlight_key
        self._label = label
        self._raw_value = raw_value
        self._tool_tip = tool_tip
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'DetailedProductInformationResultInnerAllOfTechSpecInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Detailed_product_information_result_inner_allOf_tech_spec_inner of this DetailedProductInformationResultInnerAllOfTechSpecInner.  # noqa: E501
        :rtype: DetailedProductInformationResultInnerAllOfTechSpecInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def disclaimer(self) -> str:
        """Gets the disclaimer of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The disclaimer of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._disclaimer

    @disclaimer.setter
    def disclaimer(self, disclaimer: str):
        """Sets the disclaimer of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param disclaimer: The disclaimer of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type disclaimer: str
        """

        self._disclaimer = disclaimer

    @property
    def highlight_key(self) -> str:
        """Gets the highlight_key of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The highlight_key of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._highlight_key

    @highlight_key.setter
    def highlight_key(self, highlight_key: str):
        """Sets the highlight_key of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param highlight_key: The highlight_key of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type highlight_key: str
        """

        self._highlight_key = highlight_key

    @property
    def label(self) -> str:
        """Gets the label of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The label of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label: str):
        """Sets the label of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param label: The label of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type label: str
        """

        self._label = label

    @property
    def raw_value(self) -> str:
        """Gets the raw_value of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The raw_value of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._raw_value

    @raw_value.setter
    def raw_value(self, raw_value: str):
        """Sets the raw_value of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param raw_value: The raw_value of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type raw_value: str
        """

        self._raw_value = raw_value

    @property
    def tool_tip(self) -> str:
        """Gets the tool_tip of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The tool_tip of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._tool_tip

    @tool_tip.setter
    def tool_tip(self, tool_tip: str):
        """Sets the tool_tip of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param tool_tip: The tool_tip of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type tool_tip: str
        """

        self._tool_tip = tool_tip

    @property
    def value(self) -> str:
        """Gets the value of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :return: The value of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this DetailedProductInformationResultInnerAllOfTechSpecInner.


        :param value: The value of this DetailedProductInformationResultInnerAllOfTechSpecInner.
        :type value: str
        """

        self._value = value