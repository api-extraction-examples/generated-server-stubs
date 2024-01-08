from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.jira_expression_evaluation_meta_data_bean import JiraExpressionEvaluationMetaDataBean
from openapi_server import util

from openapi_server.models.jira_expression_evaluation_meta_data_bean import JiraExpressionEvaluationMetaDataBean  # noqa: E501

class JiraExpressionResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, meta=None, value=None):  # noqa: E501
        """JiraExpressionResult - a model defined in OpenAPI

        :param meta: The meta of this JiraExpressionResult.  # noqa: E501
        :type meta: JiraExpressionEvaluationMetaDataBean
        :param value: The value of this JiraExpressionResult.  # noqa: E501
        :type value: object
        """
        self.openapi_types = {
            'meta': JiraExpressionEvaluationMetaDataBean,
            'value': object
        }

        self.attribute_map = {
            'meta': 'meta',
            'value': 'value'
        }

        self._meta = meta
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'JiraExpressionResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JiraExpressionResult of this JiraExpressionResult.  # noqa: E501
        :rtype: JiraExpressionResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def meta(self) -> JiraExpressionEvaluationMetaDataBean:
        """Gets the meta of this JiraExpressionResult.


        :return: The meta of this JiraExpressionResult.
        :rtype: JiraExpressionEvaluationMetaDataBean
        """
        return self._meta

    @meta.setter
    def meta(self, meta: JiraExpressionEvaluationMetaDataBean):
        """Sets the meta of this JiraExpressionResult.


        :param meta: The meta of this JiraExpressionResult.
        :type meta: JiraExpressionEvaluationMetaDataBean
        """

        self._meta = meta

    @property
    def value(self) -> object:
        """Gets the value of this JiraExpressionResult.

        The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)  # noqa: E501

        :return: The value of this JiraExpressionResult.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value: object):
        """Sets the value of this JiraExpressionResult.

        The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)  # noqa: E501

        :param value: The value of this JiraExpressionResult.
        :type value: object
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value
