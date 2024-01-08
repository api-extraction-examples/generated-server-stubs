import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_payment_status_ok_body import PostPaymentsSepaCreditTransfersPaymentStatusOKBody  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_payment_status_params_body import PostPaymentsSepaCreditTransfersPaymentStatusParamsBody  # noqa: E501
from openapi_server import util


def payments_sepa_credit_transfers_payment_status_post(body):  # noqa: E501
    """Get payment status

    Get the status of an existing SEPA credit transfer # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsSepaCreditTransfersPaymentStatusOKBody, Tuple[PostPaymentsSepaCreditTransfersPaymentStatusOKBody, int], Tuple[PostPaymentsSepaCreditTransfersPaymentStatusOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsSepaCreditTransfersPaymentStatusParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
