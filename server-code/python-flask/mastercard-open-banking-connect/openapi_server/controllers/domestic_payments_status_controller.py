import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body import PostPaymentsDomesticCreditTransfersPaymentStatusOKBody  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_params_body import PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody  # noqa: E501
from openapi_server import util


def payments_domestic_credit_transfers_payment_status_post(body):  # noqa: E501
    """Get payment status

    Get the status for an existing domestic credit transfer payment. # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsDomesticCreditTransfersPaymentStatusOKBody, Tuple[PostPaymentsDomesticCreditTransfersPaymentStatusOKBody, int], Tuple[PostPaymentsDomesticCreditTransfersPaymentStatusOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
